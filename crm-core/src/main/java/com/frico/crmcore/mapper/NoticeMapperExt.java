/**
 * 
 * **
 * 
 * NoticeMapperExt.java
 * 
 */
package com.frico.crmcore.mapper;

import com.frico.crmcore.model.Notice;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * NoticeMapper的扩展 Mapper 接口
 * 
 * @author 	chh
 * @date 	2019年03月20日
 */
@Resource
public interface NoticeMapperExt extends NoticeMapper {

    List<Notice> findList(Notice notice);
}