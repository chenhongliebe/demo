/**
 * 
 * **
 * 
 * MoneyRecordMapper.java
 * 
 */
package com.frico.crmcore.mapper;

import com.frico.crmcore.model.MoneyRecord;

/**
 * <p>
 * 表 : frico_crm_money_record的 Mapper 类
 * 
 * @author 	chh
 * @date 	2019年03月19日
 */
public interface MoneyRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MoneyRecord record);

    int insertSelective(MoneyRecord record);

    MoneyRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MoneyRecord record);

    int updateByPrimaryKey(MoneyRecord record);
}