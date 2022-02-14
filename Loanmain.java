import java.util.Scanner;

public class Loanmain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate= input.nextFloat();

        System.out.println("Enter number of years as an integer: ");
        int numberOfYears= input.nextInt();

        System.out.println("Enter loan amount, for example, 12000.95: ");
        double loanAmount= input.nextFloat();

        java.util.Date loanDate= new java.util.Date();
        System.out.println("The loan was created on " + loanDate);

        Loan loan1 = new Loan (annualInterestRate, numberOfYears, loanAmount, loanDate);

        System.out.printf("The monthly payment is %2f" , loan1.getmonthlyPayment());
        System.out.printf("\nThe total payment is %2f" , loan1.gettotalPayment());

    }
}
