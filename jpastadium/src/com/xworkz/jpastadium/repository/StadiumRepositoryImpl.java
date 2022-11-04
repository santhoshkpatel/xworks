package com.xworkz.jpastadium.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.jpastadium.dto.StadiumEntity;

public class StadiumRepositoryImpl implements StadiumRepository {

	@Override
	public boolean save(StadiumEntity entity) {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(entity);
		transaction.commit();
		createEntityManager.close();
		return false;
	}
	

}
