package com.xworkz.interfaclakeDAO;

//import java.util.Iterator;

public class LakeDAOImplementor implements LakeDAO {
	  private String[] lakeNames=new String[10];

	@Override
	public boolean save(String lakeName) {
		//lakeNames=lakeName;
		for (int  i=0; i < lakeNames.length; i++) {
			if(lakeNames[i]==null) {
				lakeNames[i]=lakeName;
				System.out.println("data savd succesfully");
				return false;
			}else {
				System.out.println("data not saved succesfully");
			}
		}
		return true;
	}

	@Override
	public void printAllLakes() {
		for (int i = 0; i < lakeNames.length; i++) {
			System.out.println(lakeNames[i]);
		}

	}

}
