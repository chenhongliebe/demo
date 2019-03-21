/**
 * 
 * **
 * 
 * NoticeMapper.java
 * 
 */
package com.frico.crmcore.mapper;

import com.frico.crmcore.model.Notice;

/**
 * <p>
 * 表 : frico_crm_notice的 Mapper 类
 * 
 * @author 	chh
 * @date 	2019年03月20日
 */
public interface NoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKeyWithBLOBs(Notice record);

    int updateByPrimaryKey(Notice record);
}