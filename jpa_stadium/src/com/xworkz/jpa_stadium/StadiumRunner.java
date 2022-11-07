package com.xworkz.jpa_stadium;

import java.util.Optional;

import com.xworkz.jpa_stadium.entity.StadiumEntity;
import com.xworkz.jpa_stadium.enums.StadiumType;
import com.xworkz.jpa_stadium.service.StadiumService;
import com.xworkz.jpa_stadium.service.StadiumServiceImpl;

public class StadiumRunner {

	public static void main(String[] args) {

		StadiumEntity entity=new StadiumEntity(1, "kantirva", 2001, 100, 150, StadiumType.OUTDOOR);
		StadiumEntity entity1=new StadiumEntity(2, "kkantirva", 2001, 100, 150, StadiumType.OUTDOOR);

		StadiumService service =new StadiumServiceImpl();
		
		//service.validateAndSave(entity);
		//service.validateAndSave(entity1);


		Optional<StadiumEntity> validatAndFindById = service.validatAndFindById(2);
		if(validatAndFindById.isPresent()) {
			StadiumEntity stadiumEntity = validatAndFindById.get();
			System.out.println(stadiumEntity);
			
		}else {
		System.out.println("optinal is null");
	}

}
}
