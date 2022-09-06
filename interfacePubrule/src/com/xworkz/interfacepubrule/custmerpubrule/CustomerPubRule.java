package com.xworkz.interfacepubrule.custmerpubrule;

import com.xworkz.interfacepubrule.PubRule;

public class CustomerPubRule implements PubRule {

	@Override
	public boolean dressCodefollowed() {
		System.out.println("Black dress code followed");
		return true;
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean validProof() {
		// TODO Auto-generated method stub
		return false;
	}

}
