package com.nf2.Pet_dome.entity;

import java.math.BigDecimal;

public class PPet {
    private Integer p_Id;

    private String p_Category;

    private Integer c_Id;

    private String p_Name;

    private BigDecimal p_Price;

    private String p_PhotoUrls;

    private String p_Tags;

    private String p_Status;

    public Integer getP_Id() {
        return p_Id;
    }

    public void setP_Id(Integer p_Id) {
        this.p_Id = p_Id;
    }

    public String getP_Category() {
        return p_Category;
    }

    public void setP_Category(String p_Category) {
        this.p_Category = p_Category == null ? null : p_Category.trim();
    }

    public Integer getC_Id() {
        return c_Id;
    }

    public void setC_Id(Integer c_Id) {
        this.c_Id = c_Id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name == null ? null : p_Name.trim();
    }

    public BigDecimal getP_Price() {
        return p_Price;
    }

    public void setP_Price(BigDecimal p_Price) {
        this.p_Price = p_Price;
    }

    public String getP_PhotoUrls() {
        return p_PhotoUrls;
    }

    public void setP_PhotoUrls(String p_PhotoUrls) {
        this.p_PhotoUrls = p_PhotoUrls == null ? null : p_PhotoUrls.trim();
    }

    public String getP_Tags() {
        return p_Tags;
    }

    public void setP_Tags(String p_Tags) {
        this.p_Tags = p_Tags == null ? null : p_Tags.trim();
    }

    public String getP_Status() {
        return p_Status;
    }

    public void setP_Status(String p_Status) {
        this.p_Status = p_Status == null ? null : p_Status.trim();
    }
}