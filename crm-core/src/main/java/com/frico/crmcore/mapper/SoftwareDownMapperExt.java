/**
 * 
 * **
 * 
 * SoftwareDownMapperExt.java
 * 
 */
package com.frico.crmcore.mapper;

import com.frico.crmcore.model.SoftwareDown;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * SoftwareDownMapper的扩展 Mapper 接口
 * 
 * @author 	chh
 * @date 	2019年03月20日
 */
@Resource
public interface SoftwareDownMapperExt extends SoftwareDownMapper {

    List<SoftwareDown> findList(SoftwareDown softwareDown);

}