package com.Bonsai.backend.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table()
public class Modsupplier {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int supid;
	
	String supname,supadress;
	public int getSupid() {
		return supid;
	}
	public void setSupid(int supid) {
		this.supid = supid;
	}
	public String getSupname() {
		return supname;
	}
	public void setSupname(String supname) {
		this.supname = supname;
	}
	public String getSupadress() {
		return supadress;
	}
	public void setSupadress(String supadress) {
		this.supadress = supadress;
	}


}
