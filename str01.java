package arrays;
import java.util.StringTokenizer;

public class str01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ola = "Hello";
		String resultado = ola.replace("l", "w");
		System.out.println(resultado);
	
	
		String str2 = "Hello world";
		String resultado2 = str2.substring(3,8); //(6) ia guardar só o world
		System.out.println(resultado2);
	
		String str3 = "HELLO";
		String resultado3 = str3.toLowerCase();
		System.out.println(resultado3);
		
		String str4 = "hello";
		String resultado4 = str4.toUpperCase();
		System.out.println(resultado4);
		
		String str5 = "hello ";
		String resultado6 = str5.trim();
		System.out.println(resultado6);
		
		String str6 = "Hello";
		char c = str6.charAt(1);
		System.out.println(c);
		
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals ("Hello");
		boolean b2 = s1.equals (s2);
		boolean b3 = s1.equalsIgnoreCase (s2);
		boolean b4 = s1.equalsIgnoreCase ("azul");
		System.out.println(b1 + " " + b2 + " " + b3 + " " + b4 + " ");
		
		String str = "Hello World World2";
		int poa =  str.lastIndexOf("l"); //str.indexof 
		System.out.println(poa);
		
		String valor = "CDD4.0 - Java";
			System.out.println(valor.compareTo("CDD4.0 - Java") == 0 ? true : false);
			System.out.println(valor.compareTo("CDD4.0 - JAVA")== 0? true : false);
			System.out.println(valor.compareToIgnoreCase("CDD4.0 - JAVA")== 0 ? true : false);
		
		String valor1 = "CDD - Java";
			System.out.println(valor.endsWith("Java"));
			System.out.println(valor.startsWith("C"));
			System.out.println(valor.startsWith("DD", 1));
			
		StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo mas não iremos desistir nunca");
			System.out.println(exemplo.countTokens());
			 
			
			
		
		
		 
	}
}
