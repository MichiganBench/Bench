import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age>=0 && age<18){
            System.out.println("Kid");

        } else if (age>=18 && age<30) {
            System.out.println("Teen");

        } else if (age>=30 && age<40) {
            System.out.println("adult");


        }else{
            System.out.println("Your Old");
        }

    }
}
