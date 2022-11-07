package com.xworkz.jpa_stadium.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.jpa_stadium.entity.StadiumEntity;
import com.xworkz.jpa_stadium.util.JPAUtil;

public class StadiumRepositoryImpl implements StadiumRepository {
	EntityManagerFactory factory;
	@Override
	public boolean save(StadiumEntity entity) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("forentitylink");
		EntityManager createEntityManager = JPAUtil.getFactory().createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(entity);
		transaction.commit();
		createEntityManager.close();
		
		return false;
	}

	@Override
	public Optional<StadiumEntity> findByIds(int id) {
		EntityManager createEntityManager = JPAUtil.getFactory().createEntityManager();
		StadiumEntity find = createEntityManager.find(StadiumEntity.class, id);
		if(find!=null) {
			System.out.println("entity found for id"+find);
			return 	Optional.of(find);
		}
		
		else {
			System.out.println("id is not valid"+id);
		}
		return Optional.empty();
	}

}
