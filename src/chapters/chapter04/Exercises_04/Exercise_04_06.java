package chapters.chapter04.Exercises_04;

public class Exercise_04_06 {
public static void main(String[] args) {
	double angle1 = (int) (Math.random() * 361);
	double angle2 = (int) (Math.random() * 361);
	double angle3 = (int) (Math.random() * 361);
	angle1 = Math.toRadians(angle1);
	angle2 = Math.toRadians(angle2);
	angle3 = Math.toRadians(angle3);
	int r = 40;
	double x1 = r * Math.cos(angle1);
	double x2 = r * Math.cos(angle2);
	double x3 = r * Math.cos(angle3);
	
	double y1 = r * Math.sin(angle1);
	double y2 = r * Math.sin(angle2);
	double y3 = r * Math.sin(angle3);
	
	double s1 =  Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
	double s2 =  Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
	double s3 =  Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
	
	double A = Math.acos((s1 * s1 - s2 * s2 - s3 * s3) / ( -2 * s2 * s3));
	double B = Math.acos((s2 * s2 - s1 * s1 - s3 * s3) / (-2 * s1 * s3));
	double C = Math.acos((s3 * s3 - s2 * s2 - s1 * s1) / (-2 * s1 * s2));
	A = Math.toDegrees(A);
	B = Math.toDegrees(B);
	C = Math.toDegrees(C);
	
	System.out.printf("Side1 is %2.2f , Side2 is %2.2f , Side3 %2.2f\n ", s1 , s2 , s3);
	System.out.printf("A is %2.2f\n B is %2.2f\n C is %2.2f" , A , B , C);
	
}
}
