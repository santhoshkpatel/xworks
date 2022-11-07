package com.xworks.jpa_metro.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "metroinfo")
public class MetroEntity {
	@Id
	private int id;
	private String name;
	private String place;
	private String area;
	private String state;
	private int pin; 

}
