package com.xowrkz.rulefollower;

public class RuleTester {

	public static void main(String[] args) {
		HRRules hrrules =new ITRuleFollower();
		ManagerRules managerRules = new ITRuleFollower();
		SecurityRule securityRule = new ITRuleFollower();
		hrrules.applyLeave();
		hrrules.harrasment();
		managerRules.informLeave();
		managerRules.wfh();
		securityRule.swipeCard();
		securityRule.parkingApproval();
	}

}
