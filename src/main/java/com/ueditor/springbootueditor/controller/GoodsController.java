package com.ueditor.springbootueditor.controller;

import com.ueditor.springbootueditor.Result.Result;
import com.ueditor.springbootueditor.dao.Goodsdao;
import com.ueditor.springbootueditor.entiity.Goods;
import com.ueditor.springbootueditor.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods")
@CrossOrigin
public class GoodsController {
    @Autowired
    GoodsService service;

    /**
     * 保存
     * @param goods
     * @return
     */
    @PostMapping("/save")
    public Result goodssave(Goods goods){

        return  service.add(goods);
    }

    /**
     * 找到一个
     * @param id
     * @return
     */
    @GetMapping("/findone")
    public Result findOne(String id){

        return  service.findById(Integer.parseInt(id));
    }

    /**
     * 修改
     * @param goods
     * @return
     */
    @PutMapping("/save")
    public Result update(Goods goods){

        return  service.add(goods);
    }
}
