package com.xworkz.interfaclakeDAO.second;

public class LakesDAOImplimenter implements LakesDAO{
	  private String[] lakesNames=new String[10];
	  int index=0;
	@Override
	public boolean save(String lakeName) {
		if(this.index<this.lakesNames.length ) {

		if(this.lakesNames[this.index]==null) {
			this.lakesNames[this.index]=lakeName;
			System.out.println("data saved succesfully");
			this.index++;
			return true;
		}else {
			System.out.println("data not saved");
			}
		}

		return false;
	}

	@Override
	public void printAllLakes() {
		for (int i = 0; i < lakesNames.length; i++) {
			System.out.println(this.lakesNames[i]);
		}
				
	}

	@Override
	public boolean updateByIndex(String newlake, int index) {
		this.lakesNames[this.index]=newlake;
		return true;
	}

	@Override
	public boolean deleteByIndex(int index) {
		this.lakesNames[this.index]=null;
		return true;
	}

	@Override
	public boolean updateByName(String name, String newName) {
		for (int i = 0; i < lakesNames.length; i++) {
			if(this.lakesNames[i]==name) {
				this.lakesNames[i] =newName;
				System.out.println("update by name is succefully done");
				return true;
			}else {
				System.out.println("not updated by name and new name");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		for (int i = 0; i < lakesNames.length; i++) {
			if(this.lakesNames[i]==name) {
				this.lakesNames[i] =null;
				System.out.println("deleted by name is succefully done");
				return true;
			}else {
				System.out.println("not deletd by name and new name");
				return false;
			}
		}
		return false;
	}

}
