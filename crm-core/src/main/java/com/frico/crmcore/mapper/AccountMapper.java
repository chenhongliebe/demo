/**
 * 
 * **
 * 
 * AccountMapper.java
 * 
 */
package com.frico.crmcore.mapper;

import com.frico.crmcore.model.Account;

/**
 * <p>
 * 表 : frico_crm_account的 Mapper 类
 * 
 * @author 	chh
 * @date 	2019年03月19日
 */
public interface AccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}