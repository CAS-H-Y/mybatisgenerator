package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsMemberReceiveAddress;
import com.heyang.entity.UmsMemberReceiveAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsMemberReceiveAddressMapper extends BaseDao<UmsMemberReceiveAddress> {
}