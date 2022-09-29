package com.powernode.dubbo.domain;

import java.io.Serializable;

/**
 * @author laolu
 * @version 1.0
 * @date:2022-09-19 09:20
 */
public class User implements Serializable {
    private Integer id;

    private String name;

    private String addr;

    public User() {
    }

    public User(Integer id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
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
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
