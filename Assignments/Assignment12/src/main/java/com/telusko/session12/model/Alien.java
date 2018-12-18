package com.telusko.session12.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Alien {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "alien_Sequence")
	@SequenceGenerator(name = "alien_Sequence", sequenceName = "ALIEN_SEQ")
	int aid;
	String aname;	
	int age;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", age=" + age + "]";
	}

}
