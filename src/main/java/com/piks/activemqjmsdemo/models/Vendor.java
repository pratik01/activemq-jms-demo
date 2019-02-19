package com.piks.activemqjmsdemo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vendors")
public class Vendor extends BaseEntity{

	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	@OneToMany
	@JoinTable(name = "vendor_product", joinColumns = { @JoinColumn(name = "vendor_id") }, inverseJoinColumns = {
			@JoinColumn(name = "product_id") })
	private List<Product> products;
}
