package com.xworkz.jpa_marriage.entity;

import java.time.LocalDate;

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
@Table(name = "marriageinfo")
public class MarriageEntity {
	@Id
	private int id;
	private String groom;
	private String bride;
	private String venue;
	private LocalDate date;
	private String type;

}
