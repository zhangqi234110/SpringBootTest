package com.example.demo.service;

import com.example.demo.pojo.ChengJi;

import java.util.List;

/**
 * Created by 张齐 on 2019/9/13.
 */
public interface ChengJiService {
    List<ChengJi> findAll();
    ChengJi findOne(int id);
    int addOne(ChengJi chengJi);
    int updateOne(ChengJi chengJi);
    int deleteOne(int id);
    int deleteMany(List<Integer> id);
}
