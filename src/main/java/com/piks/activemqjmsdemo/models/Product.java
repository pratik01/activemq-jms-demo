package com.piks.activemqjmsdemo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Product extends BaseEntity {

	@Column(name = "name")
	private String name;

	@ManyToMany(mappedBy = "products")
	private List<Vendor> vendor;
}
