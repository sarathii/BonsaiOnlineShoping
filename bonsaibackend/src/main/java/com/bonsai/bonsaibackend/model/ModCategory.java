package com.bonsai.bonsaibackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "modcategory")
public class ModCategory {
	@Id
	@GeneratedValue
	int catid;

	String catname, catdscrptn;

	public String getCatname() {
		return catname;
	}

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}

	public String getCatdscrptn() {
		return catdscrptn;
	}

	public void setCatdscrptn(String catdscrptn) {
		this.catdscrptn = catdscrptn;
	}

}
