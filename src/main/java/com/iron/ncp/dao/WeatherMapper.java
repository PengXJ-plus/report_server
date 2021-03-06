package com.iron.ncp.dao;

import com.iron.ncp.entity.Weather;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface WeatherMapper extends Mapper<Weather> {

    int selectMaxId();

    void insertAll(List<Weather> weathers);
}