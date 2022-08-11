class StringStaticMethods{
	static char[] data={'m','a','n'};
	static String name;
	static String detail;
	static boolean b=true;
	static String check;
	static String find;
	static String name1;
	
	public static void main(String[] args){
		
	System.out.println(StringStaticMethods.name.copyValueOf(data));
	System.out.println(StringStaticMethods.detail.copyValueOf(data,1,2));
	System.out.println(StringStaticMethods.check.valueOf(b));
	System.out.println(StringStaticMethods.find.valueOf('c'));
	System.out.println(StringStaticMethods.name1.valueOf(data));
		
		

	}
}