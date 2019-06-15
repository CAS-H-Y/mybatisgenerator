package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsMemberLevel;
import com.heyang.entity.UmsMemberLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsMemberLevelMapper extends BaseDao<UmsMemberLevel> {
}