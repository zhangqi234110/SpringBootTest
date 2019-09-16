package com.example.demo.dao;

import com.example.demo.pojo.ChengJi;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 张齐 on 2019/9/13.
 */
@Mapper
public interface ChengJiDao {
    List<ChengJi> findAll();
    ChengJi findOne(int id);
    int addOne(ChengJi chengJi);
    int deleteOne(int id);
    int updateOne(ChengJi chengJi);
    int deleteMany(List<Integer> id);
}
