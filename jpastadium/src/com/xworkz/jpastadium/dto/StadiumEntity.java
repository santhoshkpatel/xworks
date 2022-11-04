package com.xworkz.jpastadium.dto;

import javax.persistence.Table;

import org.hibernate.annotations.Entity;

import com.xworkz.jpastadium.enums.StadiumType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="stadium")
public class StadiumEntity {

	private int id;
	private String name;
	private String founderName;
	private int capacity;
	private int enteryFee;
	private StadiumType type;
	
}
