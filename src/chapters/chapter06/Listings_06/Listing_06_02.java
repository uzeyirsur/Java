
package chapters.chapter06.Listings_06;

public class Listing_06_02 {
    public static void main(String[] args) {
        System.out.print("The grade is ");
        printGrade(78.5);
        System.out.print("The grade is ");
        printGrade(59.5);
    }
    public static void printGrade(double score){
        if (score >= 90){
            System.out.println('A');
        }else if (score >= 80){
            System.out.println('B');
        }else if (score >=70){
            System.out.println('C');
        }else if ( score >= 60){
            System.out.println('D');
        }else {
            System.out.println('F');
        }
    }
}
