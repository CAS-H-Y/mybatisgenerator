package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsAdmin;
import com.heyang.entity.UmsAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsAdminMapper extends BaseDao<UmsAdmin> {
}