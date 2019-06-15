package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsIntegrationConsumeSetting;
import com.heyang.entity.UmsIntegrationConsumeSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsIntegrationConsumeSettingMapper extends BaseDao<UmsIntegrationConsumeSetting> {
}