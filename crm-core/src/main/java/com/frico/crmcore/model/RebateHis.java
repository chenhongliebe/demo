/**
 * 
 * **
 * 
 * RebateHis.java
 * 
 */
package com.frico.crmcore.model;

/**
 * <p>
 * 表 : frico_crm_rebate_his的 Model 类
 * 
 * @author 	chh
 * @date 	2019年03月21日
 */
public class RebateHis {
    /** 字段:id */
    private Integer id;

    /** 字段:exrebate，额外返佣 */
    private Double exrebate;

    /** 字段:from_time，开始时间 */
    private Long fromTime;

    /** 字段:lots */
    private Integer lots;

    /** 字段:rebate */
    private Double rebate;

    /** 字段:remark，备注 */
    private String remark;

    /** 字段:srebate */
    private Double srebate;

    /** 字段:state，状态 */
    private Integer state;

    /** 字段:to_time，结束时间 */
    private Long toTime;

    /** 字段:proxy_id，代理主键 */
    private Integer proxyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getExrebate() {
        return exrebate;
    }

    public void setExrebate(Double exrebate) {
        this.exrebate = exrebate;
    }

    public Long getFromTime() {
        return fromTime;
    }

    public void setFromTime(Long fromTime) {
        this.fromTime = fromTime;
    }

    public Integer getLots() {
        return lots;
    }

    public void setLots(Integer lots) {
        this.lots = lots;
    }

    public Double getRebate() {
        return rebate;
    }

    public void setRebate(Double rebate) {
        this.rebate = rebate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Double getSrebate() {
        return srebate;
    }

    public void setSrebate(Double srebate) {
        this.srebate = srebate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getToTime() {
        return toTime;
    }

    public void setToTime(Long toTime) {
        this.toTime = toTime;
    }

    public Integer getProxyId() {
        return proxyId;
    }

    public void setProxyId(Integer proxyId) {
        this.proxyId = proxyId;
    }
}