package com.ueditor.springbootueditor.dao;

import com.ueditor.springbootueditor.entiity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface Goodsdao extends JpaRepository<Goods,String>,JpaSpecificationExecutor<Goods> {

    public Goods findById(Integer id);
}
