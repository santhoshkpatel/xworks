package com.xworks.jpa_metro.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworks.jpa_metro.entity.MetroEntity;

public class MetroRepositoryImpl implements MetroRepository {

	@Override
	public boolean save(MetroEntity entity) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("forentitylink");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(entity);
		transaction.commit();
		createEntityManager.close();
		
		return false;
	}

}
