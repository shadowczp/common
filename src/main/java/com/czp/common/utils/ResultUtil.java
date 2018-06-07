package com.czp.common.utils;

import com.czp.common.model.ResultBean;

public class ResultUtil {
    public static ResultBean success(Object data){
        ResultBean resultBean = new ResultBean();
        resultBean.setData(data);
        return resultBean;
    }
    public static ResultBean error(String errMsg,Object data){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(ResultBean.ERROR);
        resultBean.setMsg(errMsg);
        resultBean.setData(data);
        return resultBean;
    }
}
