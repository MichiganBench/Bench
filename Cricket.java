import java.util.Random;
import java.util.Scanner;

public class Cricket {
    public static void main(String[] args){
        System.out.println("Welcome to C r i c k e t Cricket");
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int target_run = random.nextInt(30)+10;
        int batting_run = 0;
        System.out.println("The target run is "+target_run);
        label:
        while(true){
            System.out.println("Enter (H/B/Q)");
            String choice = input.next().toUpperCase();
            switch (choice) {
                case "H" -> System.out.println("""
                        H help
                        B bat
                        Q quit from the match""");
                case "B" -> {
                    int run_by_program = random.nextInt(6);
                    System.out.println("Enter Run Between 0-6:");
                    int run_by_user = input.nextInt();
                    if (run_by_user == run_by_program) {
                        if (batting_run == target_run - 1) {
                            System.out.println("The match is draw");
                            break label;
                        } else {
                            System.out.println("You are out at " + batting_run + " run(s)");
                            System.out.println("You lost by " + (target_run - batting_run) + " run(s)");
                            break label;
                        }
                    } else {
                        batting_run = batting_run + run_by_user;
                        System.out.println("Run: " + batting_run);
                        if (batting_run >= target_run) {
                            System.out.println("You win");
                            break label;
                        }
                    }
                }
                case "Q" -> System.out.println("You Resign From the match. Opponent Won.");
                default -> System.out.println("Enter proper option");
            }
        }
    }
}