package com.retire.until;

import com.retire.pojo.Result;

public class ResultUtil {

    private ResultUtil(){ }

    /**
     * 操作成功的处理流程
     * @param object
     * @return
     */
    public static Result getSuccess(Object object,Object total){
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        result.setCount(total);
        return result;
    }

    /**
     * 重载返回成功的方法，因为有时候我们不需要任何的消息数据被返回
     * @return
     */
    public static Result getSuccess(){
        return getSuccess(null,0);
    }

    /**
     * 操作失败的处理流程
     * @param code 错误码
     * @param msg 错误消息
     * @param o 错误数据（其实这个一般都不需要的，因为都已经返回失败了，数据都没必要返回）
     * @return
     */
    public static Result getError(Integer code, String msg, Object o){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(o);
        return result;
    }

    /**
     * 重载，操作失败的方法（因为操作失败一般都不需要返回数据内容）
     * @param code
     * @param msg
     * @return
     */
    public static Result getError(Integer code, String msg){
        return getError(code, msg, null);
    }
}
