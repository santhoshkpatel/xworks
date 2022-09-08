package com.xworkz.interfaclakeDAO;

public class LakeDAOTester {

	public static void main(String[] args) {
		LakeDAOImplementor dao = new LakeDAOImplementor();
		dao.save("btm");
		dao.save("HRS");
		dao.save("Ulsur");
		dao.save("Hebbal");

		dao.printAllLakes();
	}

}
