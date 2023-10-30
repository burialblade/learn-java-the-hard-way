import java.util.Scanner;

public class RudeQuestions {
    public static void main(String[] args){
        String name;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello. What is your name? ");
        name = keyboard.next();

        System.out.println("Hi, " + name + "! How old are you? ");
        age = keyboard.nextInt();
        
        System.out.print(" How much do you weigh, " + name + "? ");
        weight = keyboard.nextDouble();

        System.out.println("So you are " + age + ", eh? That is not very old.");
        System.out.print("Finally, what is your income, " + name + "? ");
        income = keyboard.nextDouble();

        System.out.print("Hopefully that is " + income + " per hour ");
        System.out.println("and not in a year!");
        System.out.print("Well, thanks for answering my rude questions, ");
        System.out.println(name + ".");

        
    }    
}
