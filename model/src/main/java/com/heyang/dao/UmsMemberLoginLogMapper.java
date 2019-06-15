package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsMemberLoginLog;
import com.heyang.entity.UmsMemberLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsMemberLoginLogMapper extends BaseDao<UmsMemberLoginLog> {
}