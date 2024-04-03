package com.example.review1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Fooditem {
     @Id
     private int eid;
     public int getEid() {
      return eid;
    }
    public void setEid(int eid) {
      this.eid = eid;
    }
    private String name;
     private String email;
     private String hotel;
     private String foodtype;
     private String foodname;
     private int rate;
     private int phno;
     private String address;
     private int pincode;
    public Fooditem() {
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public String getEmail() {
      return email;
    }
    public void setEmail(String email) {
      this.email = email;
    }
    public String getHotel() {
      return hotel;
    }
    public void setHotel(String hotel) {
      this.hotel = hotel;
    }
    public String getFoodtype() {
      return foodtype;
    }
    public void setFoodtype(String foodtype) {
      this.foodtype = foodtype;
    }
    public String getFoodname() {
      return foodname;
    }
    public void setFoodname(String foodname) {
      this.foodname = foodname;
    }
    public int getRate() {
      return rate;
    }
    public void setRate(int rate) {
      this.rate = rate;
    }
    public int getPhno() {
      return phno;
    }
    public void setPhno(int phno) {
      this.phno = phno;
    }
    public String getAddress() {
      return address;
    }
    public void setAddress(String address) {
      this.address = address;
    }
    public int getPincode() {
      return pincode;
    }
    public void setPincode(int pincode) {
      this.pincode = pincode;
    }
    public Fooditem(int eid, String name, String email, String hotel, String foodtype, String foodname, int rate,
        int phno, String address, int pincode) {
      this.eid = eid;
      this.name = name;
      this.email = email;
      this.hotel = hotel;
      this.foodtype = foodtype;
      this.foodname = foodname;
      this.rate = rate;
      this.phno = phno;
      this.address = address;
      this.pincode = pincode;
    }

    
}