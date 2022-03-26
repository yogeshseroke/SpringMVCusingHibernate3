package com.scs.dao;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Emp {
@Id	
private int empid;
@Column
private String empname;
@Column
private String empjob;
public int getEmpid() {
		return empid;
	}
public void setEmpid(int empid) {
		this.empid = empid;
	}
public String getEmpname() {
		return empname;
	}
public void setEmpname(String empname) {
		this.empname = empname;
	}
public String getEmpjob() {
		return empjob;
	}
public void setEmpjob(String empjob) {
		this.empjob = empjob;
	}
}
