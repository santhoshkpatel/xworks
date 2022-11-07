package com.xworkz.human.entity;

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
@Table(name = "humaninfo")
public class HumanEntity {
	@Id
	private int id;
	private String name;
	private String area;
	private int height;
	private double weight;
	private String colour;
	private String state;
	private String religion;
	

}
