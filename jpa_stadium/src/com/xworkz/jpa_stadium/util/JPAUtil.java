package com.xworkz.jpa_stadium.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	public static EntityManagerFactory getFactory() {
		return factory;
	}
	static {
		factory=Persistence.createEntityManagerFactory("forentitylink");
	}
	

}
