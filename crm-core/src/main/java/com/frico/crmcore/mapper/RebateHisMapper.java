/**
 * 
 * **
 * 
 * RebateHisMapper.java
 * 
 */
package com.frico.crmcore.mapper;

import com.frico.crmcore.model.RebateHis;

/**
 * <p>
 * 表 : frico_crm_rebate_his的 Mapper 类
 * 
 * @author 	chh
 * @date 	2019年03月21日
 */
public interface RebateHisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RebateHis record);

    int insertSelective(RebateHis record);

    RebateHis selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RebateHis record);

    int updateByPrimaryKey(RebateHis record);
}