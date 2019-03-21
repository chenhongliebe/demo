/**
 * 
 * **
 * 
 * RebateHisMapperExt.java
 * 
 */
package com.frico.crmcore.mapper;

import com.frico.crmcore.model.RebateHis;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * RebateHisMapper的扩展 Mapper 接口
 * 
 * @author 	chh
 * @date 	2019年03月21日
 */
@Resource
public interface RebateHisMapperExt extends RebateHisMapper {

    List<RebateHis> findList(RebateHis rebateHis);

}