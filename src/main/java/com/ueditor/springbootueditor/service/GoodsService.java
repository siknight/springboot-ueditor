package com.ueditor.springbootueditor.service;

import com.ueditor.springbootueditor.Result.Result;
import com.ueditor.springbootueditor.dao.Goodsdao;
import com.ueditor.springbootueditor.entiity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GoodsService {
    @Autowired
    Goodsdao dao;

    public Result add(Goods goods){
        dao.save(goods);
        return new Result(200,"保存成功");
    }

    public Result findById(int id){
        Goods goods = dao.findById(id);
        return new Result(200,"查找成功",goods);
    }

    public Result update(Goods goods){
        dao.save(goods);
        return new Result(200,"修改成功");
    }
}
