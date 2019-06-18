package javaString;

public class StringPractice {

	public static void main(String[] args) 
	{
		// Practice String and it's supported methods
		String s = " Java Selenium ";
			
		System.out.println(s.substring(4));
		System.out.println(s.substring(0,4));
		
		//Use of Upper Case and Lower Case
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//Use of trim
		System.out.println(s.trim());
		
		// startsWith and endsWith
		System.out.println(s.startsWith(" Ja"));
		System.out.println(s.endsWith("ium "));
		System.out.println(s.charAt(3));
		
		System.out.println("*****Programm for Intern*****");
		String si = new String("Welcome");
		String sin = si.intern();
		System.out.println(sin);
		
		//Use of valueOf
		int t = 10;
		String toi =String.valueOf(t);
		System.out.println(t+10);
		
		//Use of replace
		String re = "This is simple java string. string refers to String Class. string is sequence of characters";
		String rep = re.replace("string", "programm");
		String repl = rep.replace("programm", "string");
		
		
		System.out.println(repl);
		System.out.println(repl);
		
		//Use of String Buffer append method
		StringBuffer sb= new StringBuffer("Java");
		sb.reverse();
		System.out.println(sb);
		
		
		
         s.concat("software");
		
		System.out.println(s);
		
		//StringBuffer
		StringBuffer sb1 = new StringBuffer("durga");
		sb1.append("Software");
		
		System.out.println(sb1);
		
		String s2 = new String("durga1");
		
		if(s.equals(s2))
		{
			System.out.println("string is duplicated");
		}
		else
		{
			System.out.println("no duplicate");
		}
String s1 = new String("abc and abc and abc");
		
		int sl = s1.length();
		char c = s1.charAt(0);
		
		
		}

	}


