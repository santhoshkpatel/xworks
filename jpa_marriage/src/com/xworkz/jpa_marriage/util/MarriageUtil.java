package com.xworkz.jpa_marriage.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MarriageUtil {

private	static EntityManagerFactory factory;
public static EntityManagerFactory getFactory() {
	return factory;
}
static {
	factory=Persistence.createEntityManagerFactory("forentitylinkmarriage");
}
	
}
