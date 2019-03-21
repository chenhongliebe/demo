/**
 * 
 * **
 * 
 * AccountInfoMapper.java
 * 
 */
package com.frico.crmcore.mapper;

import com.frico.crmcore.model.AccountInfo;

/**
 * <p>
 * 表 : frico_crm_account_info的 Mapper 类
 * 
 * @author 	chh
 * @date 	2019年03月19日
 */
public interface AccountInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AccountInfo record);

    int insertSelective(AccountInfo record);

    AccountInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AccountInfo record);

    int updateByPrimaryKey(AccountInfo record);
}