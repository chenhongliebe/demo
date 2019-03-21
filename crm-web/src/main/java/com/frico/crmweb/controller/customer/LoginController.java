package com.frico.crmweb.controller.customer;

import com.alibaba.fastjson.JSONObject;
import com.frico.crmcommon.VO.ResultVO;
import com.frico.crmcommon.exception.CrmException;
import com.frico.crmcommon.paramfrom.RegisterForm;
import com.frico.crmcommon.utils.JwtTokenUtil;
import com.frico.crmcommon.utils.MD5Util;
import com.frico.crmcommon.utils.NIOClient;
import com.frico.crmcore.model.Account;
import com.frico.crmcore.model.AccountInfo;
import com.frico.crmcore.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;

@Api(tags = "LoginController",description = "直客登录接口")
@RestController
@RequestMapping("customer")
public class LoginController {

    @Autowired
    private AccountService accountService;

    @PostMapping("login")
    @ApiOperation(value = "直客登录接口",notes = "直客登录接口")
    public ResultVO login(String username,String password){

        Account account = accountService.getAccount(username);
        if(account ==null){
            throw new CrmException("用户名不存在");
        }
        String md5Password = DigestUtils.md5DigestAsHex((account.getSalt()+password).getBytes());
        if(!account.getPassword().equals(md5Password)){
            throw new CrmException("密码错误");
        }
        HashMap<String, Object> claims = new HashMap<>();
        claims.put("account",account.getAccountNo());
        HashMap<String, Object> result = new HashMap<>();
        result.put("token", JwtTokenUtil.generateToken(String.valueOf(account.getId()),claims));
        return ResultVO.success(result);
    }

    /**
	 * 用户注册
	 * @param registerForm
	 * @param bindingResult
	 * @return
	 */
    @ApiOperation(value = "直客注册接口",notes = "直客注册接口")
	@PostMapping("/register")
	@Transactional(rollbackFor = Exception.class)
	public ResultVO register(@RequestBody @Valid RegisterForm registerForm, BindingResult bindingResult) {
		if(bindingResult.hasErrors())
			throw new CrmException("1",bindingResult.getFieldError().getDefaultMessage());
		//验证短信验证码
		String msg =null;
//		JSONObject jsonObject = new JSONObject();
//		jsonObject.put("name",registerForm.getNickname());
//		jsonObject.put("email",registerForm.getEmail());
//		jsonObject.put("id", SocketEnum.MSGTYPE_1001.getCode());
//		jsonObject.put("group","");
//		jsonObject.put("city",registerForm.getCitymt());
//		jsonObject.put("country",registerForm.getNationmt());
//		jsonObject.toString();
		String str = JSONObject.toJSONString(registerForm);
		try{
			NIOClient handle = new NIOClient();
			msg=handle.accessServer(str);
			System.out.println("msg"+msg);
		} catch (Exception e) {}

		JSONObject.parseObject(msg).get("account");
		String pass = (String )JSONObject.parseObject(msg).get("password");
		JSONObject.parseObject(msg).get("real_password");

        AccountInfo accountInfo = new AccountInfo();
        accountInfo.setBankbranchmt("");
        Account account = new Account();
        String salt = MD5Util.getRandomString(5);
        account.setSalt(salt);
        account.setPassword(salt+pass);
        accountService.insert(account);
		//插入数据至账户表
//		Account account = new Account();
//		account.setStatus("1");//设置账户状态为1 待审核
//		account.setAccountNo(Integer.parseInt(msg));//mt4生成账号
//		account.setCreateTime(new Date());
//		account.setDealPwd(UserConstant.initPassword);//交易密码
//		account.setOnlyReadPwd(UserConstant.initPassword);//只读密码
//		account.setMobile(registerForm.getMobile());
//		account.setType("1");
//		account.setCustomerId(user.getId());
//		accountService.insert(account);
//		sendEmail(registerForm);//通过邮件发送账号密码
		return ResultVO.success();
	}




}

class ff{
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("username","80001");
        String token = JwtTokenUtil.generateToken("1",map);
        String map1 = JwtTokenUtil.getPrivateClaimFromToken(token,"username");
        System.out.println(map1);
        String str =JwtTokenUtil.getUsernameFromToken(token);
        System.out.println(str);
    }
}
