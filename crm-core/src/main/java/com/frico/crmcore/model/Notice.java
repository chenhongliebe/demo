/**
 * 
 * **
 * 
 * Notice.java
 * 
 */
package com.frico.crmcore.model;

import java.util.Date;

/**
 * <p>
 * 表 : frico_crm_notice的 Model 类
 * 
 * @author 	chh
 * @date 	2019年03月20日
 */
public class Notice {
    /** 字段:id，主键 */
    private Integer id;

    /** 字段:title，标题 */
    private String title;

    /** 字段:type，通知类型  1-系统维护通知  2-节假日通知 3-金融风险通知 */
    private String type;

    /** 字段:role_id，角色id */
    private Integer roleId;

    /** 字段:push_type，发布方式  1-立即发布 2-定时发布 */
    private String pushType;

    /** 字段:push_time，发布时间 */
    private Date pushTime;

    /** 字段:status，状态  0-正常  1-删除 */
    private String status;

    /** 字段:createtime，创建时间 */
    private Date createtime;

    /** 字段:updatetime，更新时间 */
    private Date updatetime;

    /** 字段:creater，创建人 */
    private Integer creater;

    /** 字段:content，发布内容 */
    private String content;


    private String condition;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getPushType() {
        return pushType;
    }

    public void setPushType(String pushType) {
        this.pushType = pushType == null ? null : pushType.trim();
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getCreater() {
        return creater;
    }

    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}