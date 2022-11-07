package com.xworkz.jpa_stadium.service;

import java.util.Optional;

import com.xworkz.jpa_stadium.entity.StadiumEntity;
import com.xworkz.jpa_stadium.enums.StadiumType;
import com.xworkz.jpa_stadium.repository.StadiumRepository;
import com.xworkz.jpa_stadium.repository.StadiumRepositoryImpl;

public class StadiumServiceImpl implements StadiumService {
	
 private StadiumRepository repo=new StadiumRepositoryImpl();
	

	@Override
	public boolean validateAndSave(StadiumEntity entity) {
		int id = entity.getId();
		String name = entity.getName();
		int foundedYear = entity.getFoundedYear();
		int capacity = entity.getCapacity();
		double entryFee = entity.getEntryFee();
		StadiumType type = entity.getType();
		if(id>0) {
			System.out.println("id is valid");
		}else {
			return false;
		} if(name!=null && name.length()>4 && name.length()<50) {
			System.out.println("name is valid");
		}else {
			return false;
		}
		if(foundedYear>2000 && foundedYear<2023) {
			System.out.println("foundedYear is valid");
		}else {
			return false;
		} if(capacity>0 && capacity<2000) {
			System.out.println("capacity is valid");
		}else{
			return false;
		}  if(entryFee>10 && entryFee<200) {
			System.out.println("entryFee is valid");
		}else{
			return false;
		} if(type!=null) {
			System.out.println("type is valid");
			this.repo.save(entity);
		}else {
			return false;
		}
		return false;
	}


	@Override
	public Optional<StadiumEntity> validatAndFindById(int id) {
		if(id>0) {
			System.out.println("id is valid");
			this.repo.findByIds(id);
		}
			
		return Optional.empty();
	}

}
