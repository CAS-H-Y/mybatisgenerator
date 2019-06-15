package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsPermission;
import com.heyang.entity.UmsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsPermissionMapper extends BaseDao<UmsPermission> {
}