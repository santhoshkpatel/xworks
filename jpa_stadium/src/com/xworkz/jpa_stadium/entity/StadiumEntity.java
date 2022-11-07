package com.xworkz.jpa_stadium.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.jpa_stadium.enums.StadiumType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stadium")

public class StadiumEntity {
	@Id
	private int id;
	private String name;
	private int foundedYear;
	private int capacity;
	private double entryFee;
	private StadiumType type;

}
