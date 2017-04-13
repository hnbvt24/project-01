import java.util.Scanner;
import java.util.Random;

class GuessingGame {
     public static void main(String[] args) {
     Random random = new Random();
     Scanner scanner = new Scanner(System.in);
     System.out.println("ADMINISTRATOR SETUP");
     System.out.println("--------------------");
     System.out.print("What type of item should go in the jar?  ");
     String item = scanner.nextLine();
     System.out.printf("Maximum number of %s in the jar:  ",
                     item);
     String number = scanner.nextLine();
 
     Jar jar = new Jar(item, number, random);
     Prompter prompter = new Prompter(jar);
     
     System.out.println("PLAYER");
     System.out.println("--------------------");
    
     System.out.printf("The goal is to guess how many %s are in the jar. Your guess should be between 1 and %s.%n",
                      jar.getItem(),
                      jar.getNumber());
       
     do {
        prompter.promptForGuess(); 
     } while (!prompter.promptForGuess());
       
       prompter.displayOutcome();
       
    }
}
