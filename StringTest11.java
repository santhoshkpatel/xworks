import java.nio.charset.Charset;
class StringTest{

  public static void main(String[] argv) {
    byte[] bytes = new byte[]{65,65,66,77,88};
    System.out.println(new String(bytes, Charset.forName("ASCII")));
    
	byte name[] = { 65,65,66,77,88};
	String s2 = new String(name, 1, 3);
    System.out.println(s2);
	
	byte namen[] = { 65,65,66,77,88 };
	String s3=new String(namen);
	System.out.println(s3);

    
  }
}
