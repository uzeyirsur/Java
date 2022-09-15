package weeks.week_04;

public class Assignment_01 {
public static void main(String[] args) {
	
	length();
	substring();
	contains();
	trim();
	charAt();
	toLowerCase();
	toUpperCase();
	
}
	
	

	
	public static void length() {
	
		String temp = "I love Inar Academy";
		int length = temp.length();
		System.out.println(length);
		
		
}
	public static void substring() {
		
		String temp = "I love Inar Academy";
		String substring = temp.substring(0);
		System.out.println(substring);
	}
	
	public static void contains() {
		
		String temp = "I love Inar Academy";
		boolean contains = temp.contains("love");
				System.out.println(contains);
	}
	
	public static void trim() {
		String temp = "		I love Inar Academy";
		String trim = temp.trim();
		System.out.println(trim);
	}
	
	
	public static void charAt() {
		String temp = "I love Inar Academy";
		char ch = temp.charAt(0);
		System.out.println(ch);
		
		
	}
	public static void toLowerCase() {
		String temp = "I love Inar Academy";
		String lower = temp.toLowerCase();
		System.out.println(lower);
	}
	public static void toUpperCase() {
		String temp = "I love Inar Academy";
		String upper = temp.toUpperCase();
		System.out.println(upper);
	}
	public static void equalsIgnoreCase() {
		
	}
	
}
