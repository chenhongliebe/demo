/**
 * 
 * **
 * 
 * Account.java
 * 
 */
package com.frico.crmcore.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 表 : frico_crm_account的 Model 类
 * 
 * @author 	chh
 * @date 	2019年03月19日
 */
public class Account {
    /** 字段:id，主键id */
    private Integer id;

    /** 字段:type，账户类型 1直客 2代理 */
    private String type;

    /** 字段:account_no，交易账号 */
    private String accountNo;

    /** 字段:balance，账户余额 */
    private BigDecimal balance;

    /** 字段:credits，信用额 */
    private BigDecimal credits;

    /** 字段:account_info_id，客户id */
    private Integer accountInfoId;

    /** 字段:status，状态 1待审用户 2正常 3已拒绝 */
    private String status;

    /** 字段:password，密码 */
    private String password;

    /** 字段:agent_type，代理类型 */
    private String agentType;

    /** 字段:organization_name，机构名称 */
    private String organizationName;

    /** 字段:organization_no，机构证号 */
    private String organizationNo;

    /** 字段:organization_img，机构照 */
    private String organizationImg;

    /** 字段:superior_agent，上级代理 */
    private Integer superiorAgent;

    /** 字段:agent_name，上级代理名称 */
    private String agentName;

    /** 字段:junior_agent_num，下级代理数 */
    private Integer juniorAgentNum;

    /** 字段:direct_members，直属会员数 */
    private Integer directMembers;

    /** 字段:check_id，审核人 */
    private Integer checkId;

    /** 字段:create_id，创建人 */
    private Integer createId;

    /** 字段:creater_type，开设代理人类型 1 管理员 2代理人 */
    private String createrType;

    /** 字段:mt_group，mt4组别主键 */
    private Integer mtGroup;

    /** 字段:salt，盐值 */
    private String salt;

    /** 字段:deal_pwd，交易密码 */
    private String dealPwd;

    /** 字段:only_read_pwd，只读密码 */
    private String onlyReadPwd;

    /** 字段:create_time，创建时间 */
    private Date createTime;

    /** 字段:update_time，更新时间 */
    private Date updateTime;

    /** 字段:nickname，昵称 */
    private String nickname;

    /** 字段:weixin */
    private String weixin;

    /** 字段:qq */
    private String qq;

    /** 字段:leverage，杠杆 */
    private String leverage;

    /** 字段:birthday，出生日期 */
    private Date birthday;

    /** 字段:proxy_date，代理时间 */
    private Date proxyDate;

    /** 字段:proxy_end_date，代理结束时间 */
    private Date proxyEndDate;


    private AccountInfo accountInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getCredits() {
        return credits;
    }

    public void setCredits(BigDecimal credits) {
        this.credits = credits;
    }

    public Integer getAccountInfoId() {
        return accountInfoId;
    }

    public void setAccountInfoId(Integer accountInfoId) {
        this.accountInfoId = accountInfoId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType == null ? null : agentType.trim();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }

    public String getOrganizationNo() {
        return organizationNo;
    }

    public void setOrganizationNo(String organizationNo) {
        this.organizationNo = organizationNo == null ? null : organizationNo.trim();
    }

    public String getOrganizationImg() {
        return organizationImg;
    }

    public void setOrganizationImg(String organizationImg) {
        this.organizationImg = organizationImg == null ? null : organizationImg.trim();
    }

    public Integer getSuperiorAgent() {
        return superiorAgent;
    }

    public void setSuperiorAgent(Integer superiorAgent) {
        this.superiorAgent = superiorAgent;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public Integer getJuniorAgentNum() {
        return juniorAgentNum;
    }

    public void setJuniorAgentNum(Integer juniorAgentNum) {
        this.juniorAgentNum = juniorAgentNum;
    }

    public Integer getDirectMembers() {
        return directMembers;
    }

    public void setDirectMembers(Integer directMembers) {
        this.directMembers = directMembers;
    }

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public String getCreaterType() {
        return createrType;
    }

    public void setCreaterType(String createrType) {
        this.createrType = createrType == null ? null : createrType.trim();
    }

    public Integer getMtGroup() {
        return mtGroup;
    }

    public void setMtGroup(Integer mtGroup) {
        this.mtGroup = mtGroup;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getDealPwd() {
        return dealPwd;
    }

    public void setDealPwd(String dealPwd) {
        this.dealPwd = dealPwd == null ? null : dealPwd.trim();
    }

    public String getOnlyReadPwd() {
        return onlyReadPwd;
    }

    public void setOnlyReadPwd(String onlyReadPwd) {
        this.onlyReadPwd = onlyReadPwd == null ? null : onlyReadPwd.trim();
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getLeverage() {
        return leverage;
    }

    public void setLeverage(String leverage) {
        this.leverage = leverage == null ? null : leverage.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getProxyDate() {
        return proxyDate;
    }

    public void setProxyDate(Date proxyDate) {
        this.proxyDate = proxyDate;
    }

    public Date getProxyEndDate() {
        return proxyEndDate;
    }

    public void setProxyEndDate(Date proxyEndDate) {
        this.proxyEndDate = proxyEndDate;
    }

    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }
}