package com.xworkz.jpa_marriage.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.jpa_marriage.entity.MarriageEntity;
import com.xworkz.jpa_marriage.util.MarriageUtil;

public class MarriageRepositoryImpl implements MarriageRepository {
 EntityManagerFactory faco= MarriageUtil.getFactory();
	@Override
	public boolean save(MarriageEntity entity) {
		EntityManager createEntityManager = faco.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			
			transaction.begin();
			createEntityManager.persist(entity);
			transaction.commit();
		} catch (PersistenceException e) {
			
			e.printStackTrace();
			transaction.rollback();
			
		}finally {
			createEntityManager.close();
		}
		return false;
	}
	@Override
	public boolean findNameById(int id) {

		EntityManager createEntityManager = faco.createEntityManager();
		//EntityTransaction transaction = createEntityManager.getTransaction();
		MarriageEntity find = createEntityManager.find(MarriageEntity.class, id);
		try {
			if(find!= null) {
				System.out.println("id is found"+find);
			}else {
				System.out.println("id is not found"+id);
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
			
		}finally {
			createEntityManager.close();
		}
		
		return true;
	}
	@Override
	public boolean updateNameById(int id, String name) {
		EntityManager createEntityManager = faco.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		MarriageEntity find = createEntityManager.find(MarriageEntity.class, id);
		transaction.begin();
		
		try {
			if(find!=null) {
				//find.setGroom(name);
				//createEntityManager.persist(find);// for update
				createEntityManager.remove(find);//for delet

				System.out.println("id is valid and name is updated"+find);

				transaction.commit();
			}else {
				System.out.println("id is not valid and name is naot updated ");
			}
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}finally {
			
			createEntityManager.close();
		}
		
		return false;
	}

}
