package com.frico.crmweb.controller.proxy;

import com.frico.crmcommon.VO.ResultVO;
import com.frico.crmcommon.utils.AuthUtil;
import com.frico.crmcore.model.Account;
import com.frico.crmcore.service.AccountService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("proxy/info")
public class PInfoController {

    @Autowired
    private AccountService accountService;

    /**
     * 获取代理信息
     * @return
     */
    @PostMapping("")
    @ApiOperation(value = "获取账户信息",notes = "获取账户信息")
    public ResultVO info(){
        String username = AuthUtil.getUserInfo().getUsername();
        Account account = accountService.getAccount(username);
        return ResultVO.success(account);
    }

    /**
     * 获取代理账户基本信息
     * @return
     */
    @GetMapping("detail")
    @ApiOperation(value = "获取账户基本信息",notes = "获取账户基本信息")
    public ResultVO detail(){
        Integer id = AuthUtil.getUserInfo().getId();
        Account account = accountService.get(id);
        return ResultVO.success(account);
    }


}
