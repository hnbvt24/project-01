import java.util.Random;

class Jar {
  private String item;
  private int maxNumber;
  private int someNumber;
  private int attempts;
  
  public Jar(String item, int maxNumber) {
    this.item = item;
    this.maxNumber = maxNumber;
    someNumber = 0;
    attempts = 0;
  }
  
  public int fill() {
     Random random = new Random();
     
     someNumber = ((random.nextInt(maxNumber)) + 1);
     // Some number will be between 1 and MAX NUMBER
     return someNumber;
  }
  
  public String getItem() {
    return item;
  }

  public int getMaxNumber() {
    return maxNumber;
  }
  
  public int checkGuess(int guessInput) {
    if(guessInput > getMaxNumber()) {
      throw new IllegalArgumentException("Your guess must be less than " + getMaxNumber()); 
    }
    
    return guessInput; 
  }
  
  public boolean applyGuess(int guessInput) {
    int guess = checkGuess(guessInput);
    boolean isCorrect = someNumber == guessInput;
    
    if (isCorrect == false) {
      if (guessInput < someNumber) {
      System.out.println("Your guess is too low");
      } else {
      System.out.println("Your guess is too high"); 
      }
      attempts ++;
    }
    return isCorrect;
  }
  
  public int getAttempts() {
    return attempts + 1; 
  }

}