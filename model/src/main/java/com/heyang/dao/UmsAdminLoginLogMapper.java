package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsAdminLoginLog;
import com.heyang.entity.UmsAdminLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsAdminLoginLogMapper extends BaseDao<UmsAdminLoginLog> {
}