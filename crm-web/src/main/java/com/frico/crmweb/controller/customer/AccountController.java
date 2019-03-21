package com.frico.crmweb.controller.customer;

import com.frico.crmcommon.VO.ResultVO;
import com.frico.crmcommon.utils.AuthUtil;
import com.frico.crmcore.model.AccountInfo;
import com.frico.crmcore.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "",value = "")
@RestController
@RequestMapping("customer")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 获取账户信息
     * @return
     */
    @PostMapping("info")
    @ApiOperation(value = "获取账户信息",notes = "获取账户信息")
    public ResultVO info(){
        Integer id = AuthUtil.getUserInfo().getId();
        AccountInfo account = accountService.getAccountInfo(id);
        return ResultVO.success(account);
    }


}
