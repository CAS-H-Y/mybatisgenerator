package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsRole;
import com.heyang.entity.UmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsRoleMapper extends BaseDao<UmsRole> {
}