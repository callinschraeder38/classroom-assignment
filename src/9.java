import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n1 = rnd.nextInt(20);
        System.out.println("Random number: " + n1);
    }
}
