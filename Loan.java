import java.lang.Math;

public class Loan {
    double annualInterestRate;
    int numberOfYears;
    double loanAmount;
    java.util.Date loanDate;
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;


    public Loan(double annualInterestRate, int numberOfYears, double loanAmount, java.util.Date loanDate) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = loanDate;
    }

    public double getannualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public double getmonthlyPayment(){
        double monthlyInterestRate = (this.getannualInterestRate()/PERCENT)/MONTHS_IN_YEAR;
        double monthlyPayment= ((this.getLoanAmount() * monthlyInterestRate) / 1)/( 1- 1/ Math.pow(1+monthlyInterestRate,this.getNumberOfYears()*MONTHS_IN_YEAR));
        return monthlyPayment;
    }
    public double gettotalPayment(){
        double totalPayment= (this.getmonthlyPayment()*this.getNumberOfYears()*MONTHS_IN_YEAR);
        return totalPayment;
    }
}




