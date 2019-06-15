package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsIntegrationChangeHistory;
import com.heyang.entity.UmsIntegrationChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsIntegrationChangeHistoryMapper extends BaseDao<UmsIntegrationChangeHistory> {
}