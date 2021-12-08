package colamthimoicoan;

/* 
make sure the cables between the router & nodes are plugged in firmly
"Did that fix the problem?"
move router to new location
"Did that fix the problem?"
get a new router
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Try rebooting the computer and try to connect");

            System.out.println(" Did that fix the problem? 1 for yes 2 for no");

            input = keyboard.nextInt();
            if (input == 2) {
                System.out.print("reboot the router and try to reconnect");

                System.out.println(" Did that fix the problem? 1 for yes 2 for no");
                input = keyboard.nextInt();
                if (input == 2) {
                    System.out.print("Make sure the cables between routers and nodes are plugged in firmly");

                    System.out.println(" Did that fix the problem? 1 for yes 2 for no");
                    input = keyboard.nextInt();
                    if (input == 2) {
                        System.out.print(" Move router to new location");

                        System.out.println(" Did that fix the problem? 1 for yes 2 for no");
                        input = keyboard.nextInt();
                        if (input == 2) {
                            System.out.print(" Get a new router");
                        }
                        if (input == 1)
                            System.exit(0);

                    }
                }

            }
        }
    }
}