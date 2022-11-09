package com.xworkz.jpa_marriage;

import java.time.LocalDate;

import com.xworkz.jpa_marriage.entity.MarriageEntity;
import com.xworkz.jpa_marriage.services.MarriageService;
import com.xworkz.jpa_marriage.services.MarriageServiceImpl;

public class MarriageRunner {

	public static void main(String[] args) {
MarriageEntity entity=new MarriageEntity(1, "Chandru", "killer", "btm", LocalDate.now(),"love marriage");
MarriageService marriageService=new MarriageServiceImpl();
//marriageService.validateAndSave(entity);
marriageService.validationFindNameById(1);
marriageService.upDateNameById(1, "dove");
		
	}

}
