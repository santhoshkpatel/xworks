package com.xworkz.interfaclakeDAO.second;

public interface LakesDAO {
	 boolean save(String lakeName);
     void printAllLakes();
     boolean updateByIndex(String newlake,int index);
     boolean deleteByIndex(int index);
     boolean updateByName(String name,String newName);
     boolean deleteByName(String name);

}
