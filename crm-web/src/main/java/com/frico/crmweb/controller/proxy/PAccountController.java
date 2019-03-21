package com.frico.crmweb.controller.proxy;

import com.frico.crmcommon.VO.ResultVO;
import com.frico.crmcommon.utils.AuthUtil;
import com.frico.crmcore.model.Account;
import com.frico.crmcore.service.AccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("proxy/account")
public class PAccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 获取直客信息列表
     * @return
     */
    @PostMapping("list")
    @ApiOperation(value = "获取直客信息列表",notes = "获取直客信息列表")
    public ResultVO list(String condition,String sort,@RequestParam(defaultValue = "1") int pageNum,
                         @RequestParam(defaultValue = "10") int pageSize){
        String username = AuthUtil.getUserInfo().getUsername();
        HashMap hashMap = new HashMap();
        hashMap.put("condition",condition);
        hashMap.put("sort",sort);
        hashMap.put("agentNo",username);//测试
        hashMap.put("type","1");//直客
        PageHelper.startPage(pageNum,pageSize);
        List<Account> list = accountService.getBySuperiorAgent(hashMap);
        PageInfo pageInfo = new PageInfo(list);
        return ResultVO.success(pageInfo);
    }

    /**
     * 获取二级代理
     * @return
     */
    @PostMapping("eragent")
    @ApiOperation(value = "获取二级代理信息列表",notes = "获取二级代理信息列表")
    public ResultVO agent(String condition,String sort,@RequestParam(defaultValue = "1") int pageNum,
                         @RequestParam(defaultValue = "10") int pageSize){
        String username = AuthUtil.getUserInfo().getUsername();
        HashMap hashMap = new HashMap();
        hashMap.put("condition",condition);
        hashMap.put("sort",sort);
        hashMap.put("agentNo",username);
        hashMap.put("type","2");//代理
        PageHelper.startPage(pageNum,pageSize);
        List<Account> list = accountService.getBySuperiorAgent(hashMap);
        PageInfo pageInfo = new PageInfo(list);
        return ResultVO.success(pageInfo);
    }

    /**
     * 获取三级代理
     * @return
     */
    @PostMapping("sanagent")
    @ApiOperation(value = "获取二级代理信息列表",notes = "获取二级代理信息列表")
    public ResultVO sanagent(String condition,String sort,@RequestParam(defaultValue = "1") int pageNum,
                          @RequestParam(defaultValue = "10") int pageSize){
        String username = AuthUtil.getUserInfo().getUsername();
        //获取二级代理用户 遍历放入set中
        Set set = new HashSet();

        HashMap hashMap = new HashMap();
        hashMap.put("condition",condition);
        hashMap.put("sort",sort);
        hashMap.put("agentNo",username);
        hashMap.put("type","2");//代理
        PageHelper.startPage(pageNum,pageSize);
        List<Account> list = accountService.getBySuperiorAgent(hashMap);
        PageInfo pageInfo = new PageInfo(list);
        return ResultVO.success(pageInfo);
    }


}
