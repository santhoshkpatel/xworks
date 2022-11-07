package com.xworks.jpa_metro;

import com.xworks.jpa_metro.entity.MetroEntity;
import com.xworks.jpa_metro.service.MetroService;
import com.xworks.jpa_metro.service.MetroServiceImpl;

public class MetroRunner {

	public static void main(String[] args) {

		MetroEntity entity=new MetroEntity(1, "jaynagra", "jaynagra", "karnatak", "karnatka", 5656);
		MetroService service=new MetroServiceImpl();
		service.validationAndSave(entity);
	}

}
