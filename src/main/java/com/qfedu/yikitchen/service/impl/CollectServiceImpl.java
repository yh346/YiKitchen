package com.qfedu.yikitchen.service.impl;

import com.qfedu.yikitchen.mapper.CollectMapper;
import com.qfedu.yikitchen.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectServiceImpl implements CollectService {
    @Autowired
    private CollectMapper collectMapper;

}
