package com.nf2.Pet_dome.entity;

public class PCategory {
    private Integer c_Id;

    private String c_Name;

    public Integer getC_Id() {
        return c_Id;
    }

    public void setC_Id(Integer c_Id) {
        this.c_Id = c_Id;
    }

    public String getC_Name() {
        return c_Name;
    }

    public void setC_Name(String c_Name) {
        this.c_Name = c_Name == null ? null : c_Name.trim();
    }
}