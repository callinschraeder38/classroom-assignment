import java.util.Random;

class RandomNumber {
  private static final Random RANDOM = new Random();

  public int getRandomInteger(int min, int max) {
    return RANDOM.nextInt((max - min) + 1) + min;
  }
}