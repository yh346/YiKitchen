package com.qfedu.yikitchen.service;

import com.qfedu.yikitchen.pojo.ShoppingCar;
import com.qfedu.yikitchen.vo.ResponseVo;

public interface ShoppingCarService {

    ResponseVo<ShoppingCar> addShop(ShoppingCar shoppingCar);

    ResponseVo<ShoppingCar> showShoppingCar(Integer id);
}
