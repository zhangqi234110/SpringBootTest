package com.example.demo;

/**
 * Created by 张齐 on 2019/9/13.
 */
public class Common {
    private int id;
    private String msg;
    private Object data;

    public Common() {
    }

    public Common(int id, String msg, Object data) {
        this.id = id;
        this.msg = msg;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
