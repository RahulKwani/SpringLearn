package com.hardware.rahul.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name="ProductTypes")
public class ProductType {

	@Id
	@GeneratedValue
	@Column(name="PRODUCT_TYPE_ID")
	private Integer typeId;
	private String type;
	private String typeDesc;
	
	public ProductType() {
	}

	public ProductType(String type, String typeDesc){
		this.type = type;
		this.typeDesc = typeDesc;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTypeDesc() {
		return typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

	@Override
	public String toString() {
		return "ProductType [typeId=" + typeId + ", type=" + type + ", typeDesc=" + typeDesc + "]";
	}

	
}
