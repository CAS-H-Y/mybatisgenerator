package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsMemberProductCategoryRelation;
import com.heyang.entity.UmsMemberProductCategoryRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsMemberProductCategoryRelationMapper extends BaseDao<UmsMemberProductCategoryRelation> {
}