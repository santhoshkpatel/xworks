package com.xowrkz.rulefollower;

public  class ITRuleFollower implements HRRules,ManagerRules,SecurityRule{
	
	public boolean applyLeave() {
		System.out.println("leave granted");
		return true;
		
	}
	public boolean harrasment() {
		System.out.println("no case found");
		return false;
		
	}
	public boolean swipeCard() {
		System.out.println("entry granted");
		return false;
		
	}
	public boolean parkingApproval() {
		System.out.println("parking alloted");
		return false;
		
	}
	public boolean informLeave() {
		System.out.println("applied leave is pending");
		return false;
		
	}
	public boolean wfh() {
		System.out.println("WHF approved");
		return false;
		
	}
}
