import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("WeLcOmE tO RoCk,PaPeR,SCiSsOrS GaMe!");
        String[] choices = {"rock", "paper", "scissors"};
        int userWins = 0;
        int computerWins = 0;
        System.out.println("Do u want to play the game (yes/no)");
        String choice=in.nextLine().toLowerCase();

        while (choice.equals("yes")) {
            System.out.println("Let's begin");
            for (int round = 1; round <= 3; round++) {
                System.out.print("Round " + round + " - Enter your choice (rock/paper/scissors): ");
                String userChoice = in.nextLine().toLowerCase();
                String compChoice = choices[rand.nextInt(choices.length)];
                System.out.println("You chose: " + userChoice);
                System.out.println("comp chose: " + compChoice);
                if (userChoice.equals(compChoice)) {
                    System.out.println("Draw match!");
                } else if (
                        (userChoice.equals("rock") && compChoice.equals("scissors")) ||
                                (userChoice.equals("paper") && compChoice.equals("rock")) ||
                                (userChoice.equals("scissors") && compChoice.equals("paper"))
                ) {
                    System.out.println("You win this round!");
                    userWins++;
                } else {
                    System.out.println("comp wins this round!");
                    computerWins++;
                }
            }

            if (userWins > computerWins) {
                System.out.println("🎉 Heyyyy, you won the game!");
            } else if (computerWins > userWins) {
                System.out.println("😎 comp won! Better luck next time.");
            } else {
                System.out.println("🤝 It's a tie!");
            }
            System.out.println("do you want to play again (yes/no):");
            choice=in.nextLine().toLowerCase();
        }
        System.out.println("Bye,have a nice day ");

    }
}