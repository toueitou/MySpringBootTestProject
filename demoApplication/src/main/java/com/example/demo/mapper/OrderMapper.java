package com.example.demo.mapper;

import com.example.demo.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderMapper {

    //获取
    public List<Order> getOrder() throws Exception;
    //根据orderId删除
    public void deleteOrder(String orderId)throws Exception;
    //新增
    public void addOrder(Order order)throws Exception;
    //修改
    public void updateOrder(Order order)throws Exception;
}