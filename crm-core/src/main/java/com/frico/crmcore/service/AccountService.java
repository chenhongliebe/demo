package com.frico.crmcore.service;

import com.frico.crmcore.model.Account;
import com.frico.crmcore.model.AccountInfo;

import java.util.List;
import java.util.Map;

public interface AccountService {

    Account getAccount(String account);

    void insert(Account account);

    AccountInfo getAccountInfo(Integer id);

    Account get(Integer id);

    List<Account> getBySuperiorAgent(Map map);

}
