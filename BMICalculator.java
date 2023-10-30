import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        double inches, pounds, bmi;

        
        System.out.print("Your height in inches: ");
        inches = keyboard.nextDouble();

        System.out.print("Your weight in pounds: ");
        pounds = keyboard.nextDouble();

        bmi = pounds / (inches*inches);
        
        System.out.println("Your BMI is: " + bmi);
    }    
}
