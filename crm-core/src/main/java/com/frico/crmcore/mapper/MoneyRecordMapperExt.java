/**
 * 
 * **
 * 
 * MoneyRecordMapperExt.java
 * 
 */
package com.frico.crmcore.mapper;

import com.frico.crmcore.model.MoneyRecord;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * MoneyRecordMapper的扩展 Mapper 接口
 * 
 * @author 	chh
 * @date 	2019年03月19日
 */
@Resource
public interface MoneyRecordMapperExt extends MoneyRecordMapper {

   List<MoneyRecord> findList(MoneyRecord moneyRecord);

}