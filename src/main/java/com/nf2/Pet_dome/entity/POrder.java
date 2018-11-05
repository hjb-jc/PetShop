package com.nf2.Pet_dome.entity;

public class POrder {
    private Integer o_Id;

    private Integer p_Id;

    private Integer u_Id;

    private Integer o_Quantity;

    private String o_ShipDate;

    private String o_Status;

    public Integer getO_Id() {
        return o_Id;
    }

    public void setO_Id(Integer o_Id) {
        this.o_Id = o_Id;
    }

    public Integer getP_Id() {
        return p_Id;
    }

    public void setP_Id(Integer p_Id) {
        this.p_Id = p_Id;
    }

    public Integer getU_Id() {
        return u_Id;
    }

    public void setU_Id(Integer u_Id) {
        this.u_Id = u_Id;
    }

    public Integer getO_Quantity() {
        return o_Quantity;
    }

    public void setO_Quantity(Integer o_Quantity) {
        this.o_Quantity = o_Quantity;
    }

    public String getO_ShipDate() {
        return o_ShipDate;
    }

    public void setO_ShipDate(String o_ShipDate) {
        this.o_ShipDate = o_ShipDate == null ? null : o_ShipDate.trim();
    }

    public String getO_Status() {
        return o_Status;
    }

    public void setO_Status(String o_Status) {
        this.o_Status = o_Status == null ? null : o_Status.trim();
    }
}