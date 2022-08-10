import java.nio.charset.Charset;
class StringTest{

  public static void main(String[] argv) {
    byte[] bytes = new byte[]{68,73,86,89,65};
    System.out.println(new String(bytes, Charset.forName("ASCII")));
    
	byte name[] = { 68,73,86,89,65 };
	String s2 = new String(name, 1, 3);
    System.out.println(s2);
	
	byte namen[] = { 68,73,86,89,65 };
	String s3=new String(namen);
	System.out.println(s3);

    
  }
}
