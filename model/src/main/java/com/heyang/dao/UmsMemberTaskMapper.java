package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsMemberTask;
import com.heyang.entity.UmsMemberTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsMemberTaskMapper extends BaseDao<UmsMemberTask> {
}