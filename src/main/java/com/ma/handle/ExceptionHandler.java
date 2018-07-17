package com.ma.handle;

import com.ma.Util.ResultUtil;
import com.ma.exception.StudentException;
import com.ma.result.ResultMsg;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mh on 2018/7/17.
 */
@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = StudentException.class)
    @ResponseBody
    public ResultMsg handler(Exception e){
        if(e instanceof StudentException){
            StudentException studentException = (StudentException) e;
            return  ResultUtil.error(studentException.getCode(),e.getMessage());
        }else{
            ResultMsg resultMsg = new ResultMsg();
            resultMsg.setCode("-1");
            resultMsg.setMsg("未知错误");
            return resultMsg;
        }


    }

}
