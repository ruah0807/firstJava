package Ch09;

public class StringInstanceMethod {

	public static void main(String[] args) {


		String str = "Hello~";
		
		// char charAt (int index)
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		
		System.out.println();
				
		
		//int compareTo (String anotherString)
		System.out.println(str.compareTo("Hello~"));
		System.out.println(str.compareTo("Hello~ JAVA~!!"));
		System.out.println(str.compareTo("Hello"));
		
		//String concat(String str)
		System.out.println(str.concat(" JAVA!"));

		//Boolean contains(CharSequence s)
		System.out.println(str.contains("llo"));
		System.out.println(str.contains("fine"));
		
		System.out.println(str.endsWith("o~"));
		System.out.println(str.endsWith("JAVA"));
		
		System.out.println(str.equals("Hello~"));
		System.out.println(str.equals("java"));
		

		System.out.println(str.indexOf('H'));
		System.out.println(str.indexOf('~'));
		
		System.out.println(str.indexOf("lo"));
		
		System.out.println(str.isEmpty());
		System.out.println("".isEmpty());
		
		System.out.println(str.length());
		System.out.println("JAVA".length());
		
		System.out.println(str.replace('~', '!'));
		
		System.out.println(str.replace("Hello", "JAVA"));
		
		System.out.println(str.startsWith("He"));
		System.out.println(str.startsWith("JAVA"));
		
		System.out.println(str.substring(2));
		
		System.out.println(str.substring(2, 4));
		
		char[] chars = str.toCharArray();
		System.out.println(chars[1]);
		
		System.out.println(str.toString());
		
		str= " Hello Java ";
		System.out.println(str);
		System.out.println(str.trim());
		
	
	}

}
