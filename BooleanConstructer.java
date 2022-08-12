package com.xworkz.string;

public class BooleanConstructer {

	public static void main(String[] args) {
		boolean status=true;
		@SuppressWarnings("deprecation")
		Boolean booleans=new Boolean(status);
		System.out.println(booleans);
		
		boolean check=booleans.booleanValue();
		System.out.println(check);
		
		int cheks=booleans.compareTo(booleans);
		System.out.println(cheks);
		
		int lcode=booleans.hashCode();
		System.out.println(lcode);
		
		String sStatus=booleans.toString();
		System.out.println(sStatus);
		
		System.out.println("<==========static methodes==========>");
		
		int status3=Boolean.compare(true, false);
		System.out.println(status3);
		
		boolean bool = Boolean.getBoolean("false");
		System.out.println(bool);
		
		int bools = Boolean.hashCode(true);
		System.out.println(bools);
		
		bool = Boolean.logicalAnd(true, true);
		System.out.println(bool);
		
		bool = Boolean.parseBoolean("true");
		System.out.println(bool);
		
	}

}
