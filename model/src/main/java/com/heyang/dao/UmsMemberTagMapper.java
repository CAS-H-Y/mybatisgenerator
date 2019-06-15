package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsMemberTag;
import com.heyang.entity.UmsMemberTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsMemberTagMapper extends BaseDao<UmsMemberTag> {
}