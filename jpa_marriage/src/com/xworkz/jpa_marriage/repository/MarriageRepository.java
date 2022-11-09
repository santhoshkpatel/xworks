package com.xworkz.jpa_marriage.repository;

import com.xworkz.jpa_marriage.entity.MarriageEntity;

public interface MarriageRepository {
	boolean save(MarriageEntity entity);
	boolean findNameById(int id);
	boolean updateNameById(int id , String name);

}
