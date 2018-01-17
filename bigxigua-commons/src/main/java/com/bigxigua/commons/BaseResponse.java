package com.bigxigua.commons;

/**
 * Created by zengliliang on 2017/12/19.
 */
public class BaseResponse<T> {
    //200 成功， 其他失败
    private int status = 200;

    //返回的数据 json格式
    private T data;

    public BaseResponse(){

    }

    public BaseResponse(T data){
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}