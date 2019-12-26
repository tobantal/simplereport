package com.jasperreport.simplereport.data;

import java.util.Date;

public class DataBean {
    private String state;
    private String item;
    private Date date;
    private int quantity;
    private int price;

    public DataBean(String state, String item, Date date, int quantity, int price) {
        super();
        this.state = state;
        this.item = item;
        this.date = date;
        this.quantity = quantity;
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
