package com.example.demo.Enum;

public enum OrderEnum {

    UNPAID(0,"待支付"),HAVE_PAID(1,"已支付"),UN_DELIVER(2,"待发货"),HAVE_DELIVER(3,"已发货"),
    HAVE_RECEIPT(4,"已收货"),HAVE_COMPLETE(5,"交易完成"),HAVE_CLOSE(6,"交易关闭");
    private Integer status;

    private String statusName;

    OrderEnum(Integer status, String statusName) {
        this.status = status;
        this.statusName = statusName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
