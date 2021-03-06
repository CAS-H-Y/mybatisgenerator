package com.heyang.entity;

import com.heyang.common.BaseDO;
import java.util.Date;

public class UmsGrowthChangeHistory extends BaseDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.member_id
     *
     * @mbggenerated
     */
    private Long memberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.change_type
     *
     * @mbggenerated
     */
    private Integer changeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.change_count
     *
     * @mbggenerated
     */
    private Integer changeCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.operate_man
     *
     * @mbggenerated
     */
    private String operateMan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.operate_note
     *
     * @mbggenerated
     */
    private String operateNote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.source_type
     *
     * @mbggenerated
     */
    private Integer sourceType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_growth_change_history
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.id
     *
     * @return the value of ums_growth_change_history.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.id
     *
     * @param id the value for ums_growth_change_history.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.member_id
     *
     * @return the value of ums_growth_change_history.member_id
     *
     * @mbggenerated
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.member_id
     *
     * @param memberId the value for ums_growth_change_history.member_id
     *
     * @mbggenerated
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.create_time
     *
     * @return the value of ums_growth_change_history.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.create_time
     *
     * @param createTime the value for ums_growth_change_history.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.change_type
     *
     * @return the value of ums_growth_change_history.change_type
     *
     * @mbggenerated
     */
    public Integer getChangeType() {
        return changeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.change_type
     *
     * @param changeType the value for ums_growth_change_history.change_type
     *
     * @mbggenerated
     */
    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.change_count
     *
     * @return the value of ums_growth_change_history.change_count
     *
     * @mbggenerated
     */
    public Integer getChangeCount() {
        return changeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.change_count
     *
     * @param changeCount the value for ums_growth_change_history.change_count
     *
     * @mbggenerated
     */
    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.operate_man
     *
     * @return the value of ums_growth_change_history.operate_man
     *
     * @mbggenerated
     */
    public String getOperateMan() {
        return operateMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.operate_man
     *
     * @param operateMan the value for ums_growth_change_history.operate_man
     *
     * @mbggenerated
     */
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.operate_note
     *
     * @return the value of ums_growth_change_history.operate_note
     *
     * @mbggenerated
     */
    public String getOperateNote() {
        return operateNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.operate_note
     *
     * @param operateNote the value for ums_growth_change_history.operate_note
     *
     * @mbggenerated
     */
    public void setOperateNote(String operateNote) {
        this.operateNote = operateNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.source_type
     *
     * @return the value of ums_growth_change_history.source_type
     *
     * @mbggenerated
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.source_type
     *
     * @param sourceType the value for ums_growth_change_history.source_type
     *
     * @mbggenerated
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }
}