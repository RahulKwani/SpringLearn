package com.hardware.rahul.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Products {

	@Id
	@GeneratedValue
	@Column(name="PRODUCT_ID")
	private Integer productId;
	private String name;
	private String brandName;
	@Column(name="NUMBER_OF_ITEMS")
	private int numberOfItems;
	private String description;
	private float price;
	@ManyToOne(optional=false , fetch=FetchType.EAGER)
	@JoinColumn(name="PRODUCT_TYPE_ID", foreignKey = @ForeignKey(name="FK_PRODUCT_TYPE"))
	private ProductType productType;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getNumberOfItems() {
		return numberOfItems;
	}
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", name=" + name + ", brandName=" + brandName + ", numberOfItems="
				+ numberOfItems + ", description=" + description + ", price=" + price + ", productType=" + productType
				+ "]";
	}
	
	
}
