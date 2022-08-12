package com.xworkz.string;

public class IntegerConstrucer {

	public static void main(String[] args) {
		// Integer intiger=new Integer(5);
		int number = 1815;
		Integer intiger = new Integer(number);
		System.out.println(intiger);

		byte buteValue = intiger.byteValue();
		System.out.println(buteValue);
		int newNmber = 188;
		int copmvalue = intiger.compareTo(newNmber);
		System.out.println(copmvalue);

		double madedouble = intiger.doubleValue();
		System.out.println(madedouble);

		boolean status = intiger.equals(55);
		System.out.println(status);

		Integer intiger1 = new Integer(85);
		float fNumber = intiger1.floatValue();
		System.out.println(intiger1);

		// int hcode=intiger.hashCode(88);
		System.out.println(intiger.hashCode());// y not printing hash code here
		String a = "200";
		System.out.println(a.hashCode());// here printng adress of the value

		/*
		 * int number2=1815; Integer intiger2 =new Integer(number2);
		 * System.out.println(intiger2); System.out.println(intiger2.hashCode());
		 */
		int intValue = intiger.intValue();// now we are converting int to int we can convert float to int
		System.out.println(intValue);

		long lngValue = intiger.longValue();
		System.out.println("long type");

		System.out.println(lngValue);
		intiger = 9999999;
		short sValue = intiger.shortValue();
		System.out.println(sValue);
		intiger = 9;
		String stringValue = intiger.toString();
		System.out.println(stringValue + 2);

		// converting string to int by usong constructer
		System.out.println("<======================>");
		Integer istring = new Integer("55");
		System.out.println(istring);

		byte byteValue = istring.byteValue();
		System.out.println(byteValue);

		Integer istring2 = new Integer("55");
		int compResult = istring2.compareTo(58);
		System.out.println(compResult);

		double dValue = istring.doubleValue();
		System.out.println(dValue);

		boolean sstatus = istring.equals(55);
		System.out.println(sstatus);

		float fValue = istring.floatValue();
		System.out.println(fValue);
		// String bit="55";
		
		int loc = istring.hashCode(44);
		System.out.println(loc);
		
		int iValues = istring.intValue();
		System.out.println(iValues);
		
		long lValues=istring.longValue();
		System.out.println(lValues);
		
		short sValues=istring.shortValue();
		System.out.println(sValues);
		
		String sStringValue=istring.toString();
		System.out.println(sStringValue);
		
	}

}
