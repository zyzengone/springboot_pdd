package com.yuetaowang.pindd.bean;


public class Result{


    private int status;
    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result create(Object result) {
        return create(result, 200); //成功默认status为success
    }

    //对方法的重载
    public static Result create(Object result, int status) {
        Result commonReturnType = new Result();
        commonReturnType.setStatus(status);
        commonReturnType.setData(result);
        return commonReturnType;
    }
}
