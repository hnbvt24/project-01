import java.util.Scanner;

//used for all input and output
// add back in public to the class before submitting!!!
class Prompter {
  private Jar jar;
  private String item;
  private int maxNumber;
  
  public Prompter(Jar jar) {
    this.jar = jar;
  }
  
  public boolean promptForGuess() {
    Scanner scanner = new Scanner(System.in);
    boolean isCorrect = false;
    
    do {
      System.out.print("Enter a number:  ");
      int guessInput = scanner.nextInt();
      try {
        isCorrect = jar.applyGuess(guessInput);
      } catch(IllegalArgumentException iae) {
        System.out.printf("%s. Please try again. %n",
                          iae.getMessage());
      }
    } while(isCorrect == false);
    
    return isCorrect;
  }
  
  public void displayOutcome() {
      System.out.printf("You got it in %d attempts.%n",
                      jar.getAttempts(),
                      jar.getItem());
  }
  
}