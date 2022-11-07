package com.xworks.jpa_metro.service;

import com.xworks.jpa_metro.entity.MetroEntity;
import com.xworks.jpa_metro.repository.MetroRepositoryImpl;

public class MetroServiceImpl implements MetroService {
	private MetroRepositoryImpl repo=new MetroRepositoryImpl();
	@Override
	public boolean validationAndSave(MetroEntity entity) {
		int id = entity.getId();
		String name = entity.getName();
		String place = entity.getPlace();
		String area = entity.getArea();
		String state = entity.getState();
		int pin = entity.getPin();
		if(id>0) {
			System.out.println("id is valid");
			if(name !=null && name.length()>4) {
				System.out.println("name is valid");
				if(place!=null) {
				System.out.println("place is valid");
				if(area !=null) {
					System.out.println("area is valid");
					if(state !=null) {
						if(pin >0) {
							System.out.println("pin is valid");
							this.repo.save(entity);
						}else {
							System.out.println("pin is vallid");
						}
					}else {
						System.out.println("area is not valid");
					}
				}else {
					System.out.println("area is not valid");
				}
				}else {
					System.out.println("place is not valid");
				}
			}else {
				System.out.println("name is not valid");
			}
		}else {
			System.out.println("id is not valid");
		}
		return false;
	}

}
