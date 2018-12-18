package com.qfedu.yikitchen.service.impl;

import com.qfedu.yikitchen.mapper.ShoppingCarMapper;
import com.qfedu.yikitchen.pojo.ShoppingCar;
import com.qfedu.yikitchen.service.ShoppingCarService;
import com.qfedu.yikitchen.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCarServoceImpl implements ShoppingCarService {

    @Autowired
    ShoppingCarMapper carMapper;
    @Override
    public ResponseVo<ShoppingCar> addShop(ShoppingCar shoppingCar) {
        int i = carMapper.insertSelective(shoppingCar);
        if (i ==1) {
            ResponseVo<ShoppingCar> vo = ResponseVo.OK();
            return vo;
        } else {
            ResponseVo<ShoppingCar> vo = ResponseVo.error();
            return vo;
        }

    }

    @Override
    public ResponseVo<ShoppingCar> showShoppingCar(Integer id) {
        List<ShoppingCar> cars = carMapper.selectCarById(id);

        if (cars == null || cars.size()==0) {
            ResponseVo<ShoppingCar> vo = ResponseVo.error();
            return vo;
        } else {
            ResponseVo<ShoppingCar> vo = ResponseVo.OK();
            vo.setData(cars);
            return vo;
        }
    }
}
