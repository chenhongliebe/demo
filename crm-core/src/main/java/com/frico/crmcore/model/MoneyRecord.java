/**
 * 
 * **
 * 
 * MoneyRecord.java
 * 
 */
package com.frico.crmcore.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 表 : frico_crm_money_record的 Model 类
 * 
 * @author 	chh
 * @date 	2019年03月19日
 */
public class MoneyRecord {
    /** 字段:id */
    private Integer id;

    /** 字段:order_no，订单号 */
    private String orderNo;

    /** 字段:account，交易账号 */
    private String account;

    /** 字段:balance，金额 */
    private BigDecimal balance;

    /** 字段:rate，汇率 */
    private BigDecimal rate;

    /** 字段:rmb，折合人民币 */
    private BigDecimal rmb;

    /** 字段:status，状态 1-待审核 2-正常 3-拒绝 */
    private String status;

    /** 字段:way，方式 1-银联 2-微信 3-支付宝 */
    private String way;

    /** 字段:type，类型（1入金2出金3内转） */
    private String type;

    /** 字段:check_time，处理时间 */
    private Date checkTime;

    /** 字段:into_account，转入账户 */
    private String intoAccount;

    /** 字段:remarks，备注 */
    private String remarks;

    /** 字段:sys_feedback，系统反馈 */
    private String sysFeedback;

    /** 字段:create_time，申请时间 */
    private Date createTime;

    /** 字段:bc_id，出金银行卡 */
    private Integer bcId;

    /** 字段:paid_time，支付时间 */
    private Date paidTime;

    /** 字段:check_id */
    private Integer checkId;

    /** 字段:tradeOrder，支付订单 */
    private String tradeorder;


    private String condition;//关键字查询

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getRmb() {
        return rmb;
    }

    public void setRmb(BigDecimal rmb) {
        this.rmb = rmb;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way == null ? null : way.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getIntoAccount() {
        return intoAccount;
    }

    public void setIntoAccount(String intoAccount) {
        this.intoAccount = intoAccount == null ? null : intoAccount.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getSysFeedback() {
        return sysFeedback;
    }

    public void setSysFeedback(String sysFeedback) {
        this.sysFeedback = sysFeedback == null ? null : sysFeedback.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getBcId() {
        return bcId;
    }

    public void setBcId(Integer bcId) {
        this.bcId = bcId;
    }

    public Date getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public String getTradeorder() {
        return tradeorder;
    }

    public void setTradeorder(String tradeorder) {
        this.tradeorder = tradeorder == null ? null : tradeorder.trim();
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}