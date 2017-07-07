package com.bonsai.bonsaibackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Cart {
 int cartitemid;
 int catid,pid,quantity,price,userid;
 String pname,status,username;
public int getCartitemid() {
	return cartitemid;
}
public void setCartitemid(int cartitemid) {
	this.cartitemid = cartitemid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getCatid() {
	return catid;
}
public void setCatid(int catid) {
	this.catid = catid;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
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
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
 
}
