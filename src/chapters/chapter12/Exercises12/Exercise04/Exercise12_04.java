package chapters.chapter12.Exercises12.Exercise04;

import chapters.chapter10.Listings10.Loan;

public class Exercise12_04 {
    public static void main(String[] args) {
       try{
           LoanWithException loan = new LoanWithException(1,1,1000);
           loan.setLoanAmount(0);
       }catch(IllegalArgumentException ex){
           System.out.println("Please enter a value greater than zero");
       }

    }
}
