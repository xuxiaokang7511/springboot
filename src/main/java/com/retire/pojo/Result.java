package com.retire.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Result<T> {
    /**
     * /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回消息
     */
    private String msg;
    /**
     * 返回数据
     */
    private T data;

    /**
     * 共有数据
     */
    private T count;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getCount() {
        return count;
    }

    public void setCount(T count) {
        this.count = count;
    }

    public Result(Integer code, String msg, T data, T count) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.count = count;
    }

    public Result() {
    }
}