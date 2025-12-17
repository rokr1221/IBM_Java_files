import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean game = true;

        while(game) {
            try {
                System.out.print("Want to Continue (y/n) : ");
                String gameContinue = sc.nextLine();
            
                if (gameContinue.equals("y")) {
                    System.out.print("Enter your Choice (0-R/1-P/2-S) : ");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    Random randomChoice = new Random();
                    int computerChoice = randomChoice.nextInt(3);

                    if ((choice == 0 && computerChoice == 2)
                            || (choice == 1 && computerChoice == 0)
                            || (choice == 2 && computerChoice == 1)) {
                        System.out.println("Computer Choice : " + computerChoice);
                        System.out.println("You Win!! :>");
                    } else {
                        System.out.println("Computer Choice : " + computerChoice);
                        System.out.println("You Lose :<");
                    }
                } else {
                    game = false;
                }

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }

        }

        System.out.println("Thank You For Playing...");

    }
}
