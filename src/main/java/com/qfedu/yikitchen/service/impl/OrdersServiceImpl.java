package com.qfedu.yikitchen.service.impl;

import com.qfedu.yikitchen.mapper.OrdersMapper;
import com.qfedu.yikitchen.pojo.Orders;
import com.qfedu.yikitchen.service.OrdersService;
import com.qfedu.yikitchen.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersMapper ordersMapper;
    @Override
    public ResponseVo<Orders> find(Integer id) {
        List<Orders> orders = ordersMapper.selectByPrimaryKey(id);
        ResponseVo<Orders> vo = ResponseVo.OK();
        vo.setData(orders);
        return vo;
    }

    @Override
    public ResponseVo<Orders> addOrders(Orders orders) {
        int i = ordersMapper.insertSelective(orders);
        if(i ==1 ) {
            ResponseVo<Orders> vo  = ResponseVo.OK();
            return vo;
        }
        ResponseVo<Orders> vo  = ResponseVo.error();
        return vo;
    }
}
