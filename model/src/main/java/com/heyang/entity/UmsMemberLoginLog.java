package com.heyang.entity;

import com.heyang.common.BaseDO;
import java.util.Date;

public class UmsMemberLoginLog extends BaseDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_login_log.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_login_log.member_id
     *
     * @mbggenerated
     */
    private Long memberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_login_log.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_login_log.ip
     *
     * @mbggenerated
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_login_log.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_login_log.login_type
     *
     * @mbggenerated
     */
    private Integer loginType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_login_log.province
     *
     * @mbggenerated
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_member_login_log
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_login_log.id
     *
     * @return the value of ums_member_login_log.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_login_log.id
     *
     * @param id the value for ums_member_login_log.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_login_log.member_id
     *
     * @return the value of ums_member_login_log.member_id
     *
     * @mbggenerated
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_login_log.member_id
     *
     * @param memberId the value for ums_member_login_log.member_id
     *
     * @mbggenerated
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_login_log.create_time
     *
     * @return the value of ums_member_login_log.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_login_log.create_time
     *
     * @param createTime the value for ums_member_login_log.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_login_log.ip
     *
     * @return the value of ums_member_login_log.ip
     *
     * @mbggenerated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_login_log.ip
     *
     * @param ip the value for ums_member_login_log.ip
     *
     * @mbggenerated
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_login_log.city
     *
     * @return the value of ums_member_login_log.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_login_log.city
     *
     * @param city the value for ums_member_login_log.city
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_login_log.login_type
     *
     * @return the value of ums_member_login_log.login_type
     *
     * @mbggenerated
     */
    public Integer getLoginType() {
        return loginType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_login_log.login_type
     *
     * @param loginType the value for ums_member_login_log.login_type
     *
     * @mbggenerated
     */
    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_login_log.province
     *
     * @return the value of ums_member_login_log.province
     *
     * @mbggenerated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_login_log.province
     *
     * @param province the value for ums_member_login_log.province
     *
     * @mbggenerated
     */
    public void setProvince(String province) {
        this.province = province;
    }
}