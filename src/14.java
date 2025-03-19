import java.util.*; 
public class RandomCode{
 public static void main(String[] args) {
	Random rand = new Random();
	int n=rand.nextInt(10)+1;
	System.out.println("The random number is : "+n);
}
}