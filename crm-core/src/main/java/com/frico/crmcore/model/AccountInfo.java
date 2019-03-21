/**
 * 
 * **
 * 
 * AccountInfo.java
 * 
 */
package com.frico.crmcore.model;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 表 : frico_crm_account_info的 Model 类
 * 
 * @author 	chh
 * @date 	2019年03月19日
 */
public class AccountInfo {
    /** 字段:id */
    private Integer id;

    /** 字段:bankBranchMT，支行 */
    private String bankbranchmt;

    /** 字段:bankOpposite，银行卡反面照 */
    private String bankopposite;

    /** 字段:bankNameMT，银行名称 */
    private String banknamemt;

    /** 字段:bankNumberMT，银行卡账号 */
    private String banknumbermt;

    /** 字段:cityMT，城市 */
    private String citymt;

    /** 字段:emailMT，邮箱 */
    private String emailmt;

    /** 字段:idnumberMT，身份证号 */
    private String idnumbermt;

    /** 字段:mtProxy，代理账号 */
    private Integer mtproxy;

    /** 字段:nationMT，国家 */
    private String nationmt;

    /** 字段:noLogin，是否可以登录 */
    private Integer nologin;

    /** 字段:noTraing，是否交易过 */
    private Integer notraing;

    /** 字段:oppositeid，身份证反面照 */
    private String oppositeid;

    /** 字段:passwordMT，交易密码 */
    private String passwordmt;

    /** 字段:phoneMT，手机号码 */
    private String phonemt;

    /** 字段:positiveid，身份证正面照 */
    private String positiveid;

    /** 字段:provinceMT，省份 */
    private String provincemt;

    /** 字段:reviceMail */
    private Integer revicemail;

    /** 字段:sexMT，性别 */
    private Integer sexmt;

    /** 字段:stateMT，状态 */
    private Integer statemt;

    /** 字段:streetMT，街道 */
    private String streetmt;

    /** 字段:realName，真实姓名 */
    private String realname;

    /** 字段:userNameMT，mt4别名 */
    private String usernamemt;

    /** 字段:bankPositive，银行卡正面照 */
    private String bankpositive;

    /** 字段:createTime */
    private Date createtime;

    /** 字段:proxy_id，代理主键 */
    private Integer proxyId;


    private List<Account> accounts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankbranchmt() {
        return bankbranchmt;
    }

    public void setBankbranchmt(String bankbranchmt) {
        this.bankbranchmt = bankbranchmt == null ? null : bankbranchmt.trim();
    }

    public String getBankopposite() {
        return bankopposite;
    }

    public void setBankopposite(String bankopposite) {
        this.bankopposite = bankopposite == null ? null : bankopposite.trim();
    }

    public String getBanknamemt() {
        return banknamemt;
    }

    public void setBanknamemt(String banknamemt) {
        this.banknamemt = banknamemt == null ? null : banknamemt.trim();
    }

    public String getBanknumbermt() {
        return banknumbermt;
    }

    public void setBanknumbermt(String banknumbermt) {
        this.banknumbermt = banknumbermt == null ? null : banknumbermt.trim();
    }

    public String getCitymt() {
        return citymt;
    }

    public void setCitymt(String citymt) {
        this.citymt = citymt == null ? null : citymt.trim();
    }

    public String getEmailmt() {
        return emailmt;
    }

    public void setEmailmt(String emailmt) {
        this.emailmt = emailmt == null ? null : emailmt.trim();
    }

    public String getIdnumbermt() {
        return idnumbermt;
    }

    public void setIdnumbermt(String idnumbermt) {
        this.idnumbermt = idnumbermt == null ? null : idnumbermt.trim();
    }

    public Integer getMtproxy() {
        return mtproxy;
    }

    public void setMtproxy(Integer mtproxy) {
        this.mtproxy = mtproxy;
    }

    public String getNationmt() {
        return nationmt;
    }

    public void setNationmt(String nationmt) {
        this.nationmt = nationmt == null ? null : nationmt.trim();
    }

    public Integer getNologin() {
        return nologin;
    }

    public void setNologin(Integer nologin) {
        this.nologin = nologin;
    }

    public Integer getNotraing() {
        return notraing;
    }

    public void setNotraing(Integer notraing) {
        this.notraing = notraing;
    }

    public String getOppositeid() {
        return oppositeid;
    }

    public void setOppositeid(String oppositeid) {
        this.oppositeid = oppositeid == null ? null : oppositeid.trim();
    }

    public String getPasswordmt() {
        return passwordmt;
    }

    public void setPasswordmt(String passwordmt) {
        this.passwordmt = passwordmt == null ? null : passwordmt.trim();
    }

    public String getPhonemt() {
        return phonemt;
    }

    public void setPhonemt(String phonemt) {
        this.phonemt = phonemt == null ? null : phonemt.trim();
    }

    public String getPositiveid() {
        return positiveid;
    }

    public void setPositiveid(String positiveid) {
        this.positiveid = positiveid == null ? null : positiveid.trim();
    }

    public String getProvincemt() {
        return provincemt;
    }

    public void setProvincemt(String provincemt) {
        this.provincemt = provincemt == null ? null : provincemt.trim();
    }

    public Integer getRevicemail() {
        return revicemail;
    }

    public void setRevicemail(Integer revicemail) {
        this.revicemail = revicemail;
    }

    public Integer getSexmt() {
        return sexmt;
    }

    public void setSexmt(Integer sexmt) {
        this.sexmt = sexmt;
    }

    public Integer getStatemt() {
        return statemt;
    }

    public void setStatemt(Integer statemt) {
        this.statemt = statemt;
    }

    public String getStreetmt() {
        return streetmt;
    }

    public void setStreetmt(String streetmt) {
        this.streetmt = streetmt == null ? null : streetmt.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getUsernamemt() {
        return usernamemt;
    }

    public void setUsernamemt(String usernamemt) {
        this.usernamemt = usernamemt == null ? null : usernamemt.trim();
    }

    public String getBankpositive() {
        return bankpositive;
    }

    public void setBankpositive(String bankpositive) {
        this.bankpositive = bankpositive == null ? null : bankpositive.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getProxyId() {
        return proxyId;
    }

    public void setProxyId(Integer proxyId) {
        this.proxyId = proxyId;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}