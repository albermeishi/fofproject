package com.fof.entity;

import java.io.Serializable;

public class FofAccount implements Serializable {
    private Integer id;

    private String name;

    private Double money;

    private static final long serialVersionUID = 1L;

    public FofAccount(Integer id, String name, Double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public FofAccount() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}