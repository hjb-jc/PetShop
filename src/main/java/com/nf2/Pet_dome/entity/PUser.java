package com.nf2.Pet_dome.entity;

public class PUser {
    private Integer u_Id;

    private String u_Name;

    private String u_Email;

    private String u_password;

    private String u_Phone;

    private Integer u_UserSatus;

    public Integer getU_Id() {
        return u_Id;
    }

    public void setU_Id(Integer u_Id) {
        this.u_Id = u_Id;
    }

    public String getU_Name() {
        return u_Name;
    }

    public void setU_Name(String u_Name) {
        this.u_Name = u_Name == null ? null : u_Name.trim();
    }

    public String getU_Email() {
        return u_Email;
    }

    public void setU_Email(String u_Email) {
        this.u_Email = u_Email == null ? null : u_Email.trim();
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password == null ? null : u_password.trim();
    }

    public String getU_Phone() {
        return u_Phone;
    }

    public void setU_Phone(String u_Phone) {
        this.u_Phone = u_Phone == null ? null : u_Phone.trim();
    }

    public Integer getU_UserSatus() {
        return u_UserSatus;
    }

    public void setU_UserSatus(Integer u_UserSatus) {
        this.u_UserSatus = u_UserSatus;
    }
}