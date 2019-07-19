package com.example.demo.service;

import com.example.demo.pojo.Order;

import java.util.List;

public interface OrderService {
    //显示所有
    public List<Order>getOrder()throws Exception;
    //根据orderId删除
    public void deleteOrder(String orderId)throws Exception;
    //新增
    public void addOrder(Order order)throws Exception;
    //修改
    public void updateOrder(Order order)throws Exception;
}
