package com.qfedu.yikitchen.service;

import com.qfedu.yikitchen.pojo.Orders;
import com.qfedu.yikitchen.vo.ResponseVo;

public interface OrdersService {
    public ResponseVo<Orders> find(Integer id);

    public ResponseVo<Orders> addOrders(Orders orders);
}
