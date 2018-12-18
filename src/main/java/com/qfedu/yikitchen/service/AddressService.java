package com.qfedu.yikitchen.service;

import com.qfedu.yikitchen.pojo.Address;
import com.qfedu.yikitchen.vo.ResponseVo;

public interface AddressService {

    ResponseVo<Address> findAddr();

    ResponseVo<Address> addAddr(Address address);
}
