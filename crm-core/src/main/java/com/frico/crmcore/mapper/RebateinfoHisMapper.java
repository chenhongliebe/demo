/**
 * 
 * **
 * 
 * RebateinfoHisMapper.java
 * 
 */
package com.frico.crmcore.mapper;

import com.frico.crmcore.model.RebateinfoHis;

/**
 * <p>
 * 表 : frico_crm_rebateinfo_his的 Mapper 类
 * 
 * @author 	chh
 * @date 	2019年03月21日
 */
public interface RebateinfoHisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RebateinfoHis record);

    int insertSelective(RebateinfoHis record);

    RebateinfoHis selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RebateinfoHis record);

    int updateByPrimaryKey(RebateinfoHis record);
}