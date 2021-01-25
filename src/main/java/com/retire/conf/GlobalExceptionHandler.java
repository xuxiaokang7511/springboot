package com.retire.conf;

import com.retire.pojo.Result;
import com.retire.until.ResultEnum;
import com.retire.until.ResultUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常统一处理类，方便用户可以更加友好的看到错误信息
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e){
        return ResultUtil.getError(ResultEnum.SystemException.getCode(),
                ResultEnum.ServiceException.getMsg());
    }

    /**
     * 处理自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(MyException.class)
    public Result handleMyException(MyException e){
        return ResultUtil.getError(e.getCode(), e.getMessage());
    }

}
