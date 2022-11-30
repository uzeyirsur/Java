
package chapters.chapter04.Exercises_04;

public class Exercise_04_03 {
public static void main(String[] args) {
	double atlantaX1 =  33.753746;
	double atlantaY1 = -84.386330;
	
	double orlandoX2 = 28.538336;
	double orlandoY2 = -81.379234;
	
	double savannahX3 = 32.076176;
	double savannahY3 = -81.088371;
	
	double charlotteX4 = 35.227085;
	double charlotteY4 = -80.843124;
	
	atlantaX1 = Math.toRadians(atlantaX1);
	atlantaY1 = Math.toRadians(atlantaY1);
	
	orlandoX2 = Math.toRadians(orlandoX2);
	orlandoY2 = Math.toRadians(orlandoX2);
	
	savannahX3 = Math.toRadians(savannahX3);
	savannahY3 = Math.toRadians(savannahY3);
	
	charlotteX4 = Math.toRadians(charlotteX4);
	charlotteY4 = Math.toRadians(charlotteY4);
	
	double radius = 6371.01;
	
	double distanceOfAtlantaSavannah = radius * Math.acos(Math.sin(atlantaX1) * Math.sin(savannahX3) + Math.cos(atlantaX1) * Math.cos(savannahX3) * Math.cos(atlantaY1 - savannahY3)); //s1

	
	double distanceOfAtlantaOrlando = radius * Math.acos(Math.sin(atlantaX1) * Math.sin(orlandoX2) + Math.cos(atlantaX1) * Math.cos(orlandoX2) * Math.cos(atlantaY1 - orlandoY2));  //s2
	
	double distanceOfOrlandoSavannah =  radius * Math.acos(Math.sin(orlandoX2) * Math.sin(savannahX3) + Math.cos(orlandoX2) * Math.cos(savannahX3) * Math.cos(orlandoY2 - savannahY3));  //s3
	double s = ( distanceOfAtlantaSavannah + distanceOfAtlantaOrlando + distanceOfOrlandoSavannah) / 2;
	
	double firstArea = Math.pow(s * (s - distanceOfAtlantaSavannah) * (s - distanceOfAtlantaOrlando) * (s - distanceOfOrlandoSavannah) , 0.5);
	
	double distanceOfAtlantaCharlotte = radius * Math.acos(Math.sin(atlantaX1) * Math.sin(charlotteX4) + Math.cos(atlantaX1) * Math.cos(charlotteX4) * Math.cos(atlantaY1 - charlotteY4)); // s2
	double distanceOfCharlotteSavannah = radius * Math.acos(Math.sin(charlotteX4) * Math.sin(savannahX3) + Math.cos(charlotteX4) * Math.cos(savannahX3) * Math.cos(charlotteY4 - savannahY3)); //s3
	
double s2 = (distanceOfAtlantaSavannah + distanceOfAtlantaCharlotte + distanceOfCharlotteSavannah) / 2;
   double secondArea = Math.pow(s2 * (s2 - distanceOfAtlantaSavannah) * (s2 - distanceOfAtlantaCharlotte) * (s2 - distanceOfCharlotteSavannah) , 0.5);
   
   System.out.println("The area is " + (firstArea + secondArea));
	

	
	
	
	
	
	
	
	
	
}
}
