/**
 * 
 * **
 * 
 * AccountMapperExt.java
 * 
 */
package com.frico.crmcore.mapper;

import com.frico.crmcore.model.Account;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * AccountMapper的扩展 Mapper 接口
 * 
 * @author 	chh
 * @date 	2019年03月19日
 */
@Resource
public interface AccountMapperExt extends AccountMapper {

    Account getAccount(String account);

    List<Account> getBySuperiorAgent(Map map);

}