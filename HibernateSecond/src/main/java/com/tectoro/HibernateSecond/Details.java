package com.tectoro.HibernateSecond;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Details 
{
	@Id
	private int id;
	private String name;
	@Lob
	private byte[] img;
	
	public Details(int id, String name, byte[] img) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Details(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Details [id=" + id + ", name=" + name + "]";
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
}
