package com.xworkz.jpa_stadium.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public enum StadiumType {
	OUTDOOR("outdoor"),INDOOR("indoor");
	private String evalue;
//	private StadiumType(String evalue ) {
//		this.evalue=evalue;
//	}
//	public String getEvalue() {
//		return evalue;
//	}
}
