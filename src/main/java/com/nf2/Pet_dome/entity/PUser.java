package com.nf2.Pet_dome.entity;

public class PUser {
    private Integer u_Id;

    private String u_FirstName;

    private String u_LastName;

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

    public String getU_FirstName() {
        return u_FirstName;
    }

    public void setU_FirstName(String u_FirstName) {
        this.u_FirstName = u_FirstName == null ? null : u_FirstName.trim();
    }

    public String getU_LastName() {
        return u_LastName;
    }

    public void setU_LastName(String u_LastName) {
        this.u_LastName = u_LastName == null ? null : u_LastName.trim();
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

    @Override
    public String toString() {
        return "PUser{" +
                "u_Id=" + u_Id +
                ", u_FirstName='" + u_FirstName + '\'' +
                ", u_LastName='" + u_LastName + '\'' +
                ", u_Email='" + u_Email + '\'' +
                ", u_password='" + u_password + '\'' +
                ", u_Phone='" + u_Phone + '\'' +
                ", u_UserSatus=" + u_UserSatus +
                '}';
    }
}