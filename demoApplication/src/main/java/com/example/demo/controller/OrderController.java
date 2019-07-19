package com.example.demo.controller;

import com.example.demo.pojo.Order;
import com.example.demo.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private Order order;

    //查询
    @RequestMapping("list")
    public List<Order> queryList() throws Exception {
        return orderService.getOrder();
    }

    //删除
    @RequestMapping("delete/{orderId}")
    public String delete(@PathVariable String orderId) throws Exception {
        orderService.deleteOrder(orderId);
        return "你已经删掉了orderId为"+orderId+"的数据";
    }

    //增加
    @RequestMapping("addOrder")
    public String addOrder(Order order) throws Exception {
        orderService.addOrder(order);
        return "增加数据成功！";
    }

    //修改
    @RequestMapping("updateOrder")
    public String updateOrder(Order order) throws Exception {
        orderService.updateOrder(order);
        return "修改数据成功！";
    }

    //分页查询
    @RequestMapping("/all")
    public List<Order> findAllOrder(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                              @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) throws Exception {
        PageHelper.startPage(pageNum,pageSize);
        List<Order> list = orderService.getOrder();
        PageInfo<Order> pageInfo=new PageInfo(list,pageSize);
        return list;
    }
}
