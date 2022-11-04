package com.xworkz.jpastadium.enums;

public enum StadiumType {
	OUTDOOR("outdoor"),INDOOR("indoor");
	private String evalue;
	private StadiumType(String evalue ) {
		this.evalue=evalue;
	}
public String getEvalue() {
	return evalue;
}
}
