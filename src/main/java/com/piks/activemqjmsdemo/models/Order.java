package com.piks.activemqjmsdemo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.piks.activemqjmsdemo.enums.OrderStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="orders")
@Getter
@Setter
@ToString
public class Order extends BaseEntity{
	
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;
	
	@Column(name="shipped_date")
	private Date shippedDate;
	
	@Column(name="remarks")
	private String remarks;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
}
