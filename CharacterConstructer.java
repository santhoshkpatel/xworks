package com.xworkz.string;

public class CharacterConstructer {

	public static void main(String[] args) {
		Character chara=new Character('a');
		System.out.println(chara);
		
		char cValue=chara.charValue();
		System.out.println(cValue);
		
		int cCopm=chara.compareTo('l');
		System.out.println(cCopm);
		
		boolean cbool=chara.equals('a');
		System.out.println(cbool);
		
		String cString=chara.toString();
		System.out.println(cString);
		
		int cLocation=chara.hashCode();
		System.out.println(cLocation);
		
		
		int cStrinNum=Character.compare('x', cValue);
		System.out.println(cStrinNum);
		
		Character ch = Character.valueOf('k');
		System.out.println(ch);
		
		char val = Character.toUpperCase(ch);
		System.out.println(val);
		
		val = (char) Character.toTitleCase(45);
		System.out.println(val);
		
		val = Character.toLowerCase('o');
		System.out.println(val);
	}

}
