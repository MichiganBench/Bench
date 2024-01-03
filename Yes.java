import java.util.Scanner;
import java.util.Random;
public class Yes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int randoom = rd.nextInt(100);
        if (randoom%3==0 && randoom%5==0){
            System.out.println("FizzBuzz" +randoom);
        } else if (randoom%3==0) {
            System.out.println("Fizz" +randoom);

        } else if (randoom%5==0) {
            System.out.println("Buzz" +randoom);

        }else {
            System.out.println("No" +randoom);
        }


    }



}
