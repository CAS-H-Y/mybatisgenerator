package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsRolePermissionRelation;
import com.heyang.entity.UmsRolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsRolePermissionRelationMapper extends BaseDao<UmsRolePermissionRelation> {
}