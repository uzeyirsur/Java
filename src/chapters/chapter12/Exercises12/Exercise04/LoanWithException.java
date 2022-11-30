
package chapters.chapter12.Exercises12.Exercise04;

public class LoanWithException {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;


    public LoanWithException() {
        this(2.5, 1, 1000);
    }


    public LoanWithException(double annualInterestRate, int numberOfYears, double loanAmount) {
        if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0) {
            throw new IllegalArgumentException("Insufficient value!");
        }
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new java.util.Date();


    }


    public double getAnnualInterestRate() {
        return annualInterestRate;
    }


    public void setAnnualInterestRate(double annualInterestRate) {
        if(annualInterestRate <=0){
            throw new  IllegalArgumentException("Input must be greater than zero");
        }
        this.annualInterestRate = annualInterestRate;
    }


    public int getNumberOfYears() {
        return numberOfYears;
    }


    public void setNumberOfYears(int numberOfYears) {
        if(numberOfYears <=0){
            throw new  IllegalArgumentException("Input must be greater than zero");
        }
        this.numberOfYears = numberOfYears;
    }


    public double getLoanAmount() {
        return loanAmount;
    }


    public void setLoanAmount(double loanAmount) {
        if(loanAmount <=0){
            throw new  IllegalArgumentException("Input must be greater than zero");
        }
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }


    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }


    public java.util.Date getLoanDate() {
        return loanDate;
    }

    @Override
    public String toString() {
        return "Loan Amount: " + loanAmount + "\nTotalPayment: " + getTotalPayment();
    }
}
