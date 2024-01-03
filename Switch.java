import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number Between 0-7");
        int day = sc.nextInt();

        switch (day){
            case (1):
                System.out.println("Sunday and it is weekend");
                break;
            case(2):
                System.out.println("Monday and it is workday");
                break;
            case(3):
                System.out.println("Tuesday and it is workday");
                break;
            case(4):
                System.out.println("Wednesday and it is workday");
                break;
            case(5):
                System.out.println("Thursday and it is workday");
                break;
            case(6):
                System.out.println("Friday and it is workday");
                break;
            case(7):
                System.out.println("Saturday and it is weekend");
                break;
        }
    }
}
