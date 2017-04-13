import java.util.Scanner;
//used for all input and output
// add back in public to the class before submitting!!!
class Prompter {
  private Jar jar;
  private String item;
  private String number;
  
  public Prompter(Jar jar) {
    this.jar = jar;
  }
  
  public boolean promptForGuess() {
    Scanner scanner = new Scanner(System.in);
    boolean isCorrect = false;
    boolean isAcceptable = false;
    
    do {
      System.out.print("Enter a number:  ");
      int guessInput = scanner.nextInt();
      try {
        isCorrect = jar.applyGuess(guessInput);
        isAcceptable = true;
      } catch(IllegalArgumentException iae) {
        System.out.printf("%s. Please try again. %n",
                          iae.getMessage());
      }
    } while(! isAcceptable);
    
    return isCorrect;
  }
  
  public void displayOutcome() {
      System.out.printf("It took you %d tries to guess how many %s were in the jar.%n",
                      jar.getAttempts(),
                      jar.getItem());
  }
  
}