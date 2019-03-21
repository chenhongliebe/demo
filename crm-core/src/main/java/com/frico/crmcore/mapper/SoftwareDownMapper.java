/**
 * 
 * **
 * 
 * SoftwareDownMapper.java
 * 
 */
package com.frico.crmcore.mapper;

import com.frico.crmcore.model.SoftwareDown;

/**
 * <p>
 * 表 : frico_crm_software_down的 Mapper 类
 * 
 * @author 	chh
 * @date 	2019年03月20日
 */
public interface SoftwareDownMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SoftwareDown record);

    int insertSelective(SoftwareDown record);

    SoftwareDown selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SoftwareDown record);

    int updateByPrimaryKey(SoftwareDown record);
}