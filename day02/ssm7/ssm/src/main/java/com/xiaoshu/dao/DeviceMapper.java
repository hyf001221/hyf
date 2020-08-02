package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Device;
import com.xiaoshu.entity.DeviceExample;
import com.xiaoshu.entity.DeviceVo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DeviceMapper extends BaseMapper<Device> {
    long countByExample(DeviceExample example);

    int deleteByExample(DeviceExample example);

    List<Device> selectByExample(DeviceExample example);

    int updateByExampleSelective(@Param("record") Device record, @Param("example") DeviceExample example);

    int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);

	List<Device> findAll(Map<String, Object> map);

	List<DeviceVo> findzz();
}