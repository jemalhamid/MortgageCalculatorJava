import java.util.Scanner;
import java.text.NumberFormat;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        final byte monthsOfYear = 12;
        final byte percent = 100; 
        
        int p;
        float annualInterestRate;
        byte periodYears;
     
        while (true){
            System.out.print("Principal($1k $1m): ");
            p = input.nextInt();
            if (p>=1000 && p<=1000000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }
        
       
        while(true){
            System.out.print("annual interest rate: ");
            annualInterestRate = input.nextFloat();
            if(annualInterestRate> 0 && annualInterestRate<=30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
            
        }
        
       
        while(true){
            System.out.print("Period (years): ");
            periodYears = input.nextByte();
            if(periodYears >0 && periodYears<=30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }
        
        float r = (annualInterestRate / percent)  / monthsOfYear;
        int n = periodYears * monthsOfYear;
         
        double x = Math.pow(1+r,n);
        double mortgage = p*(r*x)/(x-1);
        
        //System.out.println(mortgage);
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgage);
        System.out.println("Monthly Payment: " + result);
        input.close();

        
    }}

