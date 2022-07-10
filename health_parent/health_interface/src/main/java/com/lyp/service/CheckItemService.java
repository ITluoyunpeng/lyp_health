package com.lyp.service;

import com.lyp.entity.PageResult;
import com.lyp.entity.QueryPageBean;
import com.lyp.pojo.CheckItem;

//服务接口
public interface CheckItemService {
    public void add(CheckItem checkItem);
    public PageResult pageQuery(QueryPageBean queryPageBean);
    public void deleteById(Integer id);
    public void edit(CheckItem checkItem);
    public CheckItem findById(Integer id);
}
