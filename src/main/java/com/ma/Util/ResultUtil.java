package com.ma.Util;

import com.ma.result.ResultMsg;

/**
 * Created by mh on 2018/7/17.
 */
public class ResultUtil {
    public static ResultMsg success(Object object){
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setCode("0");
        resultMsg.setMsg("success");
        resultMsg.setData(object);
        return resultMsg;
        }

    public static ResultMsg success(){
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setCode("0");
        resultMsg.setMsg("success");
        return resultMsg;
    }

    public static ResultMsg error(String code,String msg){
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setCode(code);
        resultMsg.setMsg(msg);
        return resultMsg;
    }

}
