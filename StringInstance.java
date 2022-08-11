class StringInstance{
public static void main(String[] args){
		
		String str = new String();
		String fruite = str.concat("APPLE");
		System.out.println(fruite);
		
		int location = str.hashCode();
		System.out.println(location);
		
		StringBuffer fruite1 = new StringBuffer("Orenge");
		boolean sweet = str.contentEquals(fruite1);
		System.out.println(sweet);
		
		boolean jack = str.endsWith("chilli");
		System.out.println(jack);
		
		byte[] value = str.getBytes();
		System.out.println(value);
		
		String name="fruite";
		String p=name.toUpperCase();
		System.out.println(p);
		
		int look = str.indexOf("fruite",2);
		System.out.println(look);
		
		
		
		

		

	}
	}