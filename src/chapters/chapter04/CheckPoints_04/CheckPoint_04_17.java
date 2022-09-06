package chapters.chapter04.CheckPoints_04;

public class CheckPoint_04_17 {
	public static void main(String[] args) {
		String s = "Welcome to Java";
		String s1 = "Hello world";
		String s2 = "Hello Turkey";
		String s3 = s1 + s2;
		System.out.println(s3);

		// s3 = s1 - s2; incorrect
		
		System.out.println(s1 == s2);
		
		// System.out.println(s1 >= s2); incorrect
		
		System.out.println(s1.compareTo(s2));

		int i = s1.length();
		System.out.println(i);

		// char c = s1(0); incorrect
		
		 //char c =s1.charAt(s1.length()); StringIndexOutOfBoundsException incorrect


	}

}
