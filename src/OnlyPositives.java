import java.util.Scanner;
public class OnlyPositives {

    public static void main(String[] args) {
        // The task is to read an input from the user
        Scanner scan = new Scanner(System.in);

        // The task is to repeat the block until the block is exited
        while(true) {
            // The task is to ask the user for an input
            System.out.println("Give a number:");
            // The task is to read a number from the user
            int num = scan.nextInt();

            // The task is to guard and prevent unfit numbers
            // for further processing
            if(num < 0) {
                System.out.println("Unsuitable number!");
                continue;
            }

            // The task is to check if the loop should be exited
            if(num == 0) {
                break;
            }

            // The task is to print the square of the number
            if(num > 0) {
                System.out.println(Math.pow(num, 2));
            }
        }
    }
}
