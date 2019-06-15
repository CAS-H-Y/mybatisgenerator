package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsAdminPermissionRelation;
import com.heyang.entity.UmsAdminPermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsAdminPermissionRelationMapper extends BaseDao<UmsAdminPermissionRelation> {
}