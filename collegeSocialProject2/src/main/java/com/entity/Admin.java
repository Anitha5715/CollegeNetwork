
package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String body;
	private String department;
	private String address;
	private String name;

	public Admin(Long id, String title, String body, String department, String address, String name) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		department = department;
		address = address;
		name = name;
	}

	public Admin() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", title=" + title + ", body=" + body + ", Department=" + department + ", Address="
				+ address + ", Name=" + name + "]";
	}

}
