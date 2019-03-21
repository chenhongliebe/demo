package com.frico.crmcore.service.Impl;

import com.frico.crmcore.mapper.AccountInfoMapperExt;
import com.frico.crmcore.mapper.AccountMapperExt;
import com.frico.crmcore.model.Account;
import com.frico.crmcore.model.AccountInfo;
import com.frico.crmcore.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountMapperExt accountMapperExt;
    @Autowired
    private AccountInfoMapperExt accountInfoMapperExt;

    @Override
    public Account getAccount(String account) {
        return accountMapperExt.getAccount(account);
    }

    @Override
    public void insert(Account account) {
        accountMapperExt.insert(account);
    }

    @Override
    public AccountInfo getAccountInfo(Integer id) {
        return accountInfoMapperExt.getAccountInfo(id);
    }

    @Override
    public Account get(Integer id) {
        return accountMapperExt.selectByPrimaryKey(id);
    }

    @Override
    public List<Account> getBySuperiorAgent(Map map) {
        return accountMapperExt.getBySuperiorAgent(map);
    }
}
