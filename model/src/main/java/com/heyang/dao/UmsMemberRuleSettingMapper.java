package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsMemberRuleSetting;
import com.heyang.entity.UmsMemberRuleSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsMemberRuleSettingMapper extends BaseDao<UmsMemberRuleSetting> {
}