package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsGrowthChangeHistory;
import com.heyang.entity.UmsGrowthChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsGrowthChangeHistoryMapper extends BaseDao<UmsGrowthChangeHistory> {
}