package chapters.chapter04.Exercises_04;
import java.util.Scanner;
public class Exercise_04_18 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter two characters: ");
	String major = input.next();
	major = major.toLowerCase();
	if (major.equals("m1")) {
		System.out.println("Mathematics Freshman");
	}else if (major.equals("m2")) {
		System.out.println("Mathematics Sophomore");
	}else if (major.equals("m3")) {
		System.out.println("Mathematics Junior");
	}else if (major.equals("m4")) {
		System.out.println("Mathematics Senior");
	}
	else if (major.equals("c1")) {
		System.out.println("Computer Science Fresman");
	}else if (major.equals("c2")) {
		System.out.println("Computer Science Sophomore");
	}else if (major.equals("c3")) {
		System.out.println("Computer Science Junior");
	}else if (major.equals("c4")) {
		System.out.println("Computer Science Senior");
	}
	else if (major.equals("ı1")) {
		System.out.println("Information Technology Freshman");
	}else if (major.equals("ı2")) {
		System.out.println("Information Technology Sophomore");
	}else if (major.equals("ı3")) {
		System.out.println("Information Technology Junior");
	}else if (major.equals("ı4")) {
		System.out.println("Information Technology Senior");
	}else {
		System.out.println("Invalid input!");
	}
		
	
}
}
