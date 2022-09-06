package com.xworkz.interfacepubrule.custmerpubrule.downtown;

import com.xworkz.interfacepubrule.PubRule;
import com.xworkz.interfacepubrule.custmerpubrule.CustomerPubRule;

public class PubRuleTester {

	public static void main(String[] args) {
		PubRule pubRule =(PubRule)new CustomerPubRule();
		DownTownPub downTownPub=new DownTownPub(pubRule);
		downTownPub.checker();
		
	}

}
