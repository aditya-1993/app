package com.springapp.springapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Address {
	
	@Id
	@Getter
	@Setter
	private Integer id;

	@Column
	@Getter
	@Setter
	private String country;

}
