package com.qfedu.yikitchen.service;

import com.qfedu.yikitchen.pojo.Focus;
import com.qfedu.yikitchen.vo.ResultBean;

public interface FocusService {
    ResultBean FocusOrNo(Focus focus);
    ResultBean addFocus(Focus focus);
    ResultBean deleteFocus(Focus focus);
}
