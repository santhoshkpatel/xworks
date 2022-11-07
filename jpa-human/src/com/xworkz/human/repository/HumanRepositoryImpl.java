package com.xworkz.human.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.human.entity.HumanEntity;

public class HumanRepositoryImpl implements HumanRepository {

	@Override
	public boolean save(HumanEntity entity) {
   EntityManagerFactory factory = Persistence.createEntityManagerFactory("forentitylinks");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(entity);
		transaction.commit();
		createEntityManager.close();
		
		
		
		return false;
	}

}
