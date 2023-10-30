import java.util.Scanner;

public class WeaselOrNot {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String word;
        boolean yes, no;

        System.out.println("Type the word \"weasel\", please.");
        word = keyboard.next();
        
        yes = word.equals("weasel");
        no = ! word.equals("weasel");

        System.out.println("Correct, " + yes);
        System.out.println("Wrong, " + no);
    }
}
