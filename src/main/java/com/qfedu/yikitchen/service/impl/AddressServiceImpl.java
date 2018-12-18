package com.qfedu.yikitchen.service.impl;

import com.qfedu.yikitchen.mapper.AddressMapper;
import com.qfedu.yikitchen.pojo.Address;
import com.qfedu.yikitchen.service.AddressService;
import com.qfedu.yikitchen.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressMapper addressMapper;

    @Override
    public ResponseVo<Address> findAddr() {
        ResponseVo<Address> vo = ResponseVo.OK();
        List<Address> select = addressMapper.select();
        vo.setData(select);
        return vo;
    }

    @Override
    public ResponseVo<Address> addAddr(Address address) {
        int i = addressMapper.insertSelective(address);
        if (i==0) {
            ResponseVo<Address> vo = ResponseVo.error();
            vo.setMsg("网络异常，请重新添加");
            return vo;
        } else {
            ResponseVo<Address> vo = ResponseVo.OK();
            return vo;
        }
    }
}
