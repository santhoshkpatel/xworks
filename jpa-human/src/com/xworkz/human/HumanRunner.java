package com.xworkz.human;

import com.xworkz.human.entity.HumanEntity;
import com.xworkz.human.service.HumanService;
import com.xworkz.human.service.HumanServiceImpl;

public class HumanRunner {

	public static void main(String[] args) {

		HumanEntity entity=new HumanEntity(1, "rajavera", "jayangra", 50, 65, "gray", "karnatka", "hindhu");
		HumanService service=new HumanServiceImpl();
		service.validationAndSave(entity);
		
	}

}
