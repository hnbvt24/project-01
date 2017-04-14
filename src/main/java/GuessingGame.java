import java.util.Scanner;

class GuessingGame {
     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    
     System.out.print("What type of item should go in the jar?  ");
     String item = scanner.nextLine();
     System.out.printf("What is the maximum amount of %s?  ",
                     item);
     int maxNumber = scanner.nextInt();
       
     Jar jar = new Jar(item, maxNumber);
     Prompter prompter = new Prompter(jar);
     
     jar.fill();
       
     System.out.printf("How many %s are in the jar? Pick a number between 1 and %s.%n",
                      jar.getItem(),
                      jar.getMaxNumber());
       
     while (prompter.promptForGuess() == false) {
       prompter.promptForGuess();
     }
       prompter.displayOutcome();
    }
}
