package com.example.demo.service.impl;

import com.example.demo.Common;
import com.example.demo.dao.ChengJiDao;
import com.example.demo.pojo.ChengJi;
import com.example.demo.service.ChengJiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 张齐 on 2019/9/13.
 */
@Service
public class ChengJiServiceImpl implements ChengJiService {
    @Autowired(required = true)
    private ChengJiDao chengJiDao;

    @Override
    public List<ChengJi> findAll() {
        List<ChengJi> all = chengJiDao.findAll();
        return all;
    }

    @Override
    public ChengJi findOne(int id) {
        ChengJi one = chengJiDao.findOne(id);
        return one;
    }

    @Override
    public int addOne(ChengJi chengJi) {
        int i = chengJiDao.addOne(chengJi);
        return i;
    }

    @Override
    public int updateOne(ChengJi chengJi) {
        int i = chengJiDao.updateOne(chengJi);
        return i;
    }

    @Override
    public int deleteOne(int id) {
        int i = chengJiDao.deleteOne(id);
        return i;
    }

    @Override
    public int deleteMany(List<Integer> id) {
        int i = chengJiDao.deleteMany(id);
        return i;
    }
}
