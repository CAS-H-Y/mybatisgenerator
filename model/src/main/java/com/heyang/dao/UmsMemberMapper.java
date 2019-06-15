package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsMember;
import com.heyang.entity.UmsMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsMemberMapper extends BaseDao<UmsMember> {
}