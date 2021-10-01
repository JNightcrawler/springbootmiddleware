package com.middleware.springboot.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disposition {
	@Id
	public UUID ref_id;
	public String name;
	public String code;
	public UUID getRef_id() {
		return ref_id;
	}
	public void setRef_id(UUID ref_id) {
		this.ref_id = ref_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Disposition() {
		
	}
	@Override
	public String toString() {
		return "Disposition [ref_id=" + ref_id + ", name=" + name + ", code=" + code + "]";
	}
	

}