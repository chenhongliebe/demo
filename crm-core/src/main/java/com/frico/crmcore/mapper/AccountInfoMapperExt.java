/**
 * 
 * **
 * 
 * AccountInfoMapperExt.java
 * 
 */
package com.frico.crmcore.mapper;

import com.frico.crmcore.model.AccountInfo;

import javax.annotation.Resource;

/**
 * <p>
 * AccountInfoMapper的扩展 Mapper 接口
 * 
 * @author 	chh
 * @date 	2019年03月19日
 */
@Resource
public interface AccountInfoMapperExt extends AccountInfoMapper {

    AccountInfo getAccountInfo(Integer id);
}