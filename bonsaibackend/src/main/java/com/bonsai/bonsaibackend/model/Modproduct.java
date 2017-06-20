package com.bonsai.bonsaibackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="product")
public class Modproduct {
	@Id
	int pid;
	int catid,supid, price, quantity;
	String pname, pdscrptn;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public int getSupid() {
		return supid;
	}

	public void setSupid(int supid) {
		this.supid = supid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdscrptn() {
		return pdscrptn;
	}

	public void setPdscrptn(String pdscrptn) {
		this.pdscrptn = pdscrptn;
	}
}
