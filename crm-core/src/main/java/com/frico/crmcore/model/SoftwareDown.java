/**
 * 
 * **
 * 
 * SoftwareDown.java
 * 
 */
package com.frico.crmcore.model;

import java.util.Date;

/**
 * <p>
 * 表 : frico_crm_software_down的 Model 类
 * 
 * @author 	chh
 * @date 	2019年03月20日
 */
public class SoftwareDown {
    /** 字段:id */
    private Integer id;

    /** 字段:name，名称 */
    private String name;

    /** 字段:introduct，简介 */
    private String introduct;

    /** 字段:url，下载路径 */
    private String url;

    /** 字段:size，大小 */
    private String size;

    /** 字段:format，格式 */
    private String format;

    /** 字段:type，类型 */
    private String type;

    /** 字段:icon，封面 */
    private String icon;

    /** 字段:down_num，下载次数 */
    private Integer downNum;

    /** 字段:status，状态 1上架 2下架 */
    private String status;

    /** 字段:create_time，创建时间 */
    private Date createTime;

    /** 字段:update_time，更新时间 */
    private Date updateTime;

    /** 字段:create_id，创建人 */
    private Integer createId;

    /** 字段:update_id，更新人 */
    private Integer updateId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIntroduct() {
        return introduct;
    }

    public void setIntroduct(String introduct) {
        this.introduct = introduct == null ? null : introduct.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getDownNum() {
        return downNum;
    }

    public void setDownNum(Integer downNum) {
        this.downNum = downNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }
}