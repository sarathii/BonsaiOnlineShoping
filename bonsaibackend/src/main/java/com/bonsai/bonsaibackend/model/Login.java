package com.bonsai.bonsaibackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="login")
public class Login {
	@Id
	@GeneratedValue
	int userid;
	String password,custname,email,adress;
	int mobno;
	Boolean role,enabled;
	

}
