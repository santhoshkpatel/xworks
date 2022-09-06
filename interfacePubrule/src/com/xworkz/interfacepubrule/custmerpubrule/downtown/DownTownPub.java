package com.xworkz.interfacepubrule.custmerpubrule.downtown;
import com.xworkz.interfacepubrule.PubRule;
public class DownTownPub {
	private PubRule rule;
	public DownTownPub(PubRule rule) {
		this.rule=rule;
	}
 public void checker() {
	 boolean dress=this.rule.dressCodefollowed();
	    int ages=this.rule.age();
	    boolean profs=this.rule.validProof();
	    if(dress && ages>23 && profs) {
	    	System.out.println("pubs rules are followed");
	    }else {
	    	System.out.println("pubs rules are not followed");
	    }
 }
}
