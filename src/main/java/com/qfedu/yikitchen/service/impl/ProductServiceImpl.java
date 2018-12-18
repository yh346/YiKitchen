package com.qfedu.yikitchen.service.impl;

import com.qfedu.yikitchen.mapper.ProductMapper;
import com.qfedu.yikitchen.pojo.Product;
import com.qfedu.yikitchen.service.ProductService;
import com.qfedu.yikitchen.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
   @Autowired
    ProductMapper productMapper;


//    @Override
//    public Map<String, List<Product>>  find() {
//
//        ResponseVo vo = ResponseVo.OK();
//        Map<String, List<Product>> map1 = new LinkedHashMap<>();
//        List<Product> select = productMapper.select();
//        List<Product> list1 = null;
//        for (Product p : select
//        ) {
//            if (map1.containsKey(p.getTypeName())) {
//                map1.get(p.getTypeName()).add(p);
//            } else {
//                List<Product> list2 = new ArrayList<>();
//                list2.add(p);
//                map1.put(p.getTypeName(), list2);
//            }
//
//        }
//
//        return map1;
//    }

    @Override
    public ResponseVo<Product> ById(Integer id) {
        List<Product> select = productMapper.select(id);
        if (select ==null || select.size()==0) {
            ResponseVo vo  = ResponseVo.error();
            vo.setMsg("查找失败");
            return vo;

        }  else {
            ResponseVo vo  = ResponseVo.OK();
            vo.setData(select);
            vo.setMsg("查找成功");
            return vo;
        }

    }

    @Override
    public ResponseVo<Product> FindById(Integer id) {

        List<Product> products = productMapper.selectById(id);
        if (products ==null || products.size()==0) {
            ResponseVo vo  = ResponseVo.error();
            vo.setMsg("查找失败");
            return vo;

        }  else {
            ResponseVo vo  = ResponseVo.OK();
            vo.setData(products);
            vo.setMsg("查找成功");
            return vo;
        }
    }

    @Override
    public ResponseVo<Product> FindAll() {
        ResponseVo vo = ResponseVo.OK();
        vo.setData(productMapper.selectAll());
        return vo;
    }
}
