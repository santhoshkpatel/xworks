package com.xworkz.jpa_marriage.services;

import java.time.LocalDate;

import com.xworkz.jpa_marriage.entity.MarriageEntity;
import com.xworkz.jpa_marriage.repository.MarriageRepository;
import com.xworkz.jpa_marriage.repository.MarriageRepositoryImpl;

public class MarriageServiceImpl implements MarriageService {
private MarriageRepository repo= new MarriageRepositoryImpl();
	@Override
	public boolean validateAndSave(MarriageEntity entity) {

		int id = entity.getId();
		String groom = entity.getGroom();
		String bride = entity.getBride();
		String venue = entity.getVenue();

		String type = entity.getType();
		LocalDate date = entity.getDate();

		if(id>0) {
			System.out.println("id is valid");
			
		}else {
			System.out.println("id is not valid");
		}
		if(groom!=null) {
			System.out.println("groom is valid");
			
		}else {
			System.out.println("groom is not valid");
		}
		if(bride!=null) {
			System.out.println("bride is valid");
			
		}else {
			System.out.println("bride is not valid");
		}
		if(venue!=null) {
			System.out.println("venue is valid");
			
		}else {
			System.out.println("venue is not valid");
		}
		if(type!=null) {
			System.out.println("type is valid");
			
		}else {
			System.out.println("type is not valid");
		}
		if(date!=null) {
			System.out.println("date is valid");
		this.repo.save(entity);
			
		}else {
			System.out.println("date is not valid");
		}
		

	
		
		return true;
	}
	@Override
	public boolean validationFindNameById(int id) {
		if(id>0) {
			repo.findNameById(id);
		}
		return true;
	}
	@Override
	public boolean upDateNameById(int id, String name) {
		repo.updateNameById(id, name);
		return true;
	}
	

}
