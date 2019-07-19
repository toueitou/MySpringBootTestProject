package com.example.demo.service;

import com.example.demo.mapper.OrderMapper;
import com.example.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getOrder() throws Exception {
        return orderMapper.getOrder();
    }
    //根据orderId删除
    @Override
    public void deleteOrder(String orderId) throws Exception {
        orderMapper.deleteOrder(orderId);
    }
    //新增
    @Override
    public void addOrder(Order order) throws Exception {
        orderMapper.addOrder(order);
    }

    //修改
    @Override
    public void updateOrder(Order order) throws Exception {
        orderMapper.updateOrder(order);
    }

//    @Override
//    public List<Order> findAllOrder() throws Exception {
//        return orderMapper.getOrder();
//    }
}
