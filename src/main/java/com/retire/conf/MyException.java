package com.retire.conf;

import com.retire.until.ResultEnum;

/**
 * 自定义异常，为了区分系统异常和更方便系统的特定一些处理
 *  * 在系统中，存在着系统异常和我们人为的自定义异常，
 *  * 所以，为了能够有效的针对不同异常进行处理，那么拥有我们自定义的异常类是非常有必要的。
 */
public class MyException extends RuntimeException  {
    /**
     * 错误码
     */
    private Integer code;

    public MyException(String message){
        super(message);
    }

    /**
     * 构造器重载，主要是自己考虑某些异常自定义一些返回码
     * @param code
     * @param message
     */
    public MyException(Integer code, String message){
        super(message);
        this.code = code;
    }

    /**
     * 构造器重载
     * @param resultEnum
     */
    public MyException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
