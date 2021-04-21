package com.springapp.springapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private Integer age;
	
	/*
	 * @Column
	 * 
	 * 
	 * private Address address;
	 */
	 
	
	@Column
	private Date createdAt;
	
}
