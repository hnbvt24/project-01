import java.util.Random;

class Jar {
  private String item;
  private String number;
  private Random random;
  private int attempts;
  
  public Jar(String item, String number, Random random) {
    this.item = item;
    this.number = number;
    this.random = random;
    attempts = 0;
  }
  
  public String getItem() {
    return item;
  }

  public String getNumber() {
    return number;
  }
  
  public Random getRandom() {
    return random; 
  }
  
  public boolean applyGuess(int guessInput) {
    int maxItemsAllowed = Integer.parseInt(getNumber());
    int someNumber = (getRandom().nextInt(maxItemsAllowed)) + 1;
    boolean isCorrect = someNumber == guessInput;
    if (isCorrect) {
      System.out.println("You've got it!");
    } else {
      attempts ++;
      System.out.println("Guess again.");
    }
    return isCorrect;
  }
  
  public int getAttempts() {
    return attempts; 
  }
  
//  public boolean isWon() {
//    return random.equals(guess);
//  }
  
}