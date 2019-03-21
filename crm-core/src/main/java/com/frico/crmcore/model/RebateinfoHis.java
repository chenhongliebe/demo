/**
 * 
 * **
 * 
 * RebateinfoHis.java
 * 
 */
package com.frico.crmcore.model;

/**
 * <p>
 * 表 : frico_crm_rebateinfo_his的 Model 类
 * 
 * @author 	chh
 * @date 	2019年03月21日
 */
public class RebateinfoHis {
    /** 字段:id */
    private Integer id;

    /** 字段:exrebate */
    private Float exrebate;

    /** 字段:from_time */
    private Long fromTime;

    /** 字段:isunder */
    private Integer isunder;

    /** 字段:lots，手数 */
    private Integer lots;

    /** 字段:rebate */
    private Float rebate;

    /** 字段:symrebates */
    private String symrebates;

    /** 字段:to_time */
    private Long toTime;

    /** 字段:type，0:直客返佣记录  1:下级代理返佣记录 */
    private Integer type;

    /** 字段:account_no，mt4账号 */
    private Integer accountNo;

    /** 字段:proxy_id，代理主键 */
    private Integer proxyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getExrebate() {
        return exrebate;
    }

    public void setExrebate(Float exrebate) {
        this.exrebate = exrebate;
    }

    public Long getFromTime() {
        return fromTime;
    }

    public void setFromTime(Long fromTime) {
        this.fromTime = fromTime;
    }

    public Integer getIsunder() {
        return isunder;
    }

    public void setIsunder(Integer isunder) {
        this.isunder = isunder;
    }

    public Integer getLots() {
        return lots;
    }

    public void setLots(Integer lots) {
        this.lots = lots;
    }

    public Float getRebate() {
        return rebate;
    }

    public void setRebate(Float rebate) {
        this.rebate = rebate;
    }

    public String getSymrebates() {
        return symrebates;
    }

    public void setSymrebates(String symrebates) {
        this.symrebates = symrebates == null ? null : symrebates.trim();
    }

    public Long getToTime() {
        return toTime;
    }

    public void setToTime(Long toTime) {
        this.toTime = toTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public Integer getProxyId() {
        return proxyId;
    }

    public void setProxyId(Integer proxyId) {
        this.proxyId = proxyId;
    }
}