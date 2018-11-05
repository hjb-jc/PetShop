package com.nf2.Pet_dome.entity;

public class PTag {
    private Integer t_Id;

    private String t_Name;

    public Integer getT_Id() {
        return t_Id;
    }

    public void setT_Id(Integer t_Id) {
        this.t_Id = t_Id;
    }

    public String getT_Name() {
        return t_Name;
    }

    public void setT_Name(String t_Name) {
        this.t_Name = t_Name == null ? null : t_Name.trim();
    }
}