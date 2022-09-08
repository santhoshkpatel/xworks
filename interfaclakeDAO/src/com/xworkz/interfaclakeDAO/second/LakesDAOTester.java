package com.xworkz.interfaclakeDAO.second;


public class LakesDAOTester {

	public static void main(String[] args) {
		LakesDAOImplimenter dao = new LakesDAOImplimenter();
		dao.save("btm");
		dao.save("HRS");
		dao.save("Ulsur");
		dao.save("Hebbal");

		dao.printAllLakes();
		dao.updateByIndex("Kaveri", 1);
		dao.printAllLakes();
		dao.deleteByIndex(1);
		dao.printAllLakes();
		dao.updateByName("HSR", "Bhdra");
		dao.printAllLakes();


	}

}
