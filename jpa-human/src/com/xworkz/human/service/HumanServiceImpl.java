package com.xworkz.human.service;

import com.xworkz.human.entity.HumanEntity;
import com.xworkz.human.repository.HumanRepository;
import com.xworkz.human.repository.HumanRepositoryImpl;

public class HumanServiceImpl implements HumanService {
private HumanRepository repo=new HumanRepositoryImpl();
	@Override
	public boolean validationAndSave(HumanEntity entity) {
       int id = entity.getId();
       String name = entity.getName();
       String area = entity.getArea();
       int height = entity.getHeight();
       double weight = entity.getWeight();
       String colour = entity.getColour();
       String state = entity.getState();
       String religion = entity.getReligion();
       if(id>0) {
    	     	   System.out.println("id is valid");
    	     	   if(name !=null) {
    	     		   System.out.println("name is vlid");
    	     		   if(area != null) {
    	     			   System.out.println("area is vlid");
    	     			   if(height>15) {
    	     				   System.out.println("height is valid");
    	     				   if(weight>60) {
    	     					   System.out.println(" weight is valid");
    	     					   if(colour != null) {
    	     						   System.out.println("colour is vlaid");
    	     						   if(state !=null) {
    	     							   System.out.println(" state is valid");
    	     							   if(religion!=null) {
    	     								   System.out.println("religion is valid");
    	     								   this.repo.save(entity);
    	     							   }else {
    	     								   System.out.println(" religion is not valid");
    	     							   }
    	     						   }else {
    	     							   System.out.println("stste is not valid");
    	     						   }
    	     					   }else {
    	     						   System.out.println("color is not valid");
    	     					   }
    	     				   }else {
    	     					   System.out.println("weight is not valid");
    	     				   }
    	     			   }else {
    	     				   System.out.println(" height is not valid");
    	     			   }
    	     		   }else {
    	     			   System.out.println("area is not valid");
    	     		   }
    	     	   }else {
    	     		   System.out.println("name is not vlaid");
    	     	   }
       }else {
    	   System.out.println("id is not valid");
       }
		
		return false;
	}

}
