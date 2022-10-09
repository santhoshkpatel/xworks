package com.xworks.collection.statesliss;

import java.util.ArrayList;
import java.util.Iterator;

public class StateOfIndia {

	public static void main(String[] args) {

		ArrayList<String> state=new ArrayList<String>();
		state.add("AndraPradesh");
		state.add("ArunachalPradesh");
		state.add("Assam");
		state.add("Bihar");
		state.add("Chettusghar");
		state.add("Goa");
		state.add("Gujarat");
		state.add("Haryan");
		state.add("HimachalPradesh");
		state.add("Jharkahnd");
		state.add("Karnatka");
		state.add("Keral");
		state.add("MadhyaPradesh");
		state.add("Mahrastra");
		state.add("Manipur");
		state.add("Mizrom");
		state.add("Nagaland");
		state.add("Odisha");
		state.add("Panjab");
		state.add("Rajastan");
		state.add("Sikkim");
		state.add("Tamilnadu");
		state.add("Telnagana");
		state.add("Tripura");
		state.add("uattarkhand");
		state.add("Uttarpradesh");
		state.add("WestBengal");
		state.add("Puducherry");
		state.add("Ladakh");
		state.add("jammuKashmir");
		state.add("Lakshadweep");

//		for (String String : state) {
//			System.out.println(state);
//		}
		state.forEach((ref) -> System.out.println("state name :" + ref));  
		System.out.println("===========");

		state.stream().filter((ref) -> ref.endsWith("a")).forEach(ref -> System.out.println(ref));
		System.out.println("===================");

		state.stream().filter((ref) -> ref.startsWith("K")).forEach(ref -> System.out.println(ref));
		System.out.println("====================");

		state.stream().filter((ref) -> ref.contains("L")).forEach(ref -> System.out.println(ref));
		System.out.println("====================");

	    state.stream().filter((ref) -> ref.contains("D")).forEach(ref -> System.out.println(ref));
		System.out.println("====================");

		state.stream().filter((ref) -> ref.contains("R")).forEach(ref -> System.out.println(ref));
		System.out.println("====================");

		state.stream().filter((ref) -> ref.contains("h")).forEach(ref -> System.out.println(ref));
		System.out.println("====================");

		state.stream().filter((ref) -> ref.length() > 10).forEach(ref -> System.out.println(ref));
		System.out.println("=====================");

		state.stream().filter((ref) -> ref.length() < 5).forEach(ref -> System.out.println(ref));
		System.out.println("================");

		state.stream().forEach((ref) -> System.out.println(ref.toUpperCase()));
		System.out.println("==================");

		state.stream().forEach((ref) -> System.out.println(ref.toLowerCase()));
		System.out.println("====================");

		state.stream().forEach((ref) -> System.out.println(new StringBuffer().append(ref).reverse()));

		
	}

}
