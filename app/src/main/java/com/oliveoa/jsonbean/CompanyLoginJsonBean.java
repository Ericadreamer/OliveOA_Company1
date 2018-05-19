package com.oliveoa.jsonbean;

import com.oliveoa.pojo.CompanyInfo;

public class CompanyLoginJsonBean {
    private int status;
    private String msg;
    private CompanyInfo data;

    public CompanyLoginJsonBean(int status, String msg, CompanyInfo data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CompanyInfo getData() {
        return data;
    }

    public void setData(CompanyInfo data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CompanyLoginJsonBean{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}

