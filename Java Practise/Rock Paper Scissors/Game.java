import java.util.Random;
import java.util.Scanner;

public class Game {

int hScore=0;
int pScore=0;

    public Game() {
    }

    public void begin() {

        System.out.println("Enter Rock, Paper or Scissors: ");
        Scanner playerchoice = new Scanner(System.in);
        String choice = playerchoice.nextLine().toLowerCase();

        String[] options = {"Rock", "Paper", "Scissors"};
        Random r = new Random();
        int randomnum = r.nextInt(((options.length - 1) - 0) + 1) + 0;


        if (choice.equals(options[randomnum].toLowerCase())) {
            System.out.println("We picked the same!");
            this.begin();
        }
       else if (pScore>=4)
        {
            System.out.println("You have won!!");
            pScore=0;
            hScore=0;
            begin();

        }
        else if (hScore>=4) {

            System.out.println("I have won");
            pScore =0;
            hScore=0;
            begin();

        }
        else if (choice.equals("paper") && options[randomnum].toLowerCase().equals("rock")) {

                this.pScore++;
                System.out.println("I picked " + options[randomnum]);
                System.out.println("You have one point total is: " + pScore);

                this.begin();

        } else if (choice.equals("rock") && options[randomnum].toLowerCase().equals("scissors")) {
            this.pScore++;

            System.out.println("I picked " + options[randomnum]);
            System.out.println("You have one point total is: " + pScore);
            this.begin();

        } else if (choice.equals("scissors") && options[randomnum].toLowerCase().equals("paper")) {
            this.pScore++;
            System.out.println("I picked " + options[randomnum]);
            System.out.println("You have one point total is :" + pScore);
            this.begin();

        } else if (choice.equals("rock") && options[randomnum].toLowerCase().equals("paper")) {
            this.hScore++;
            System.out.println("I picked " + options[randomnum]);
            System.out.println("I gain one point total is: " + hScore);
            this.begin();

        } else if (choice.equals("paper") && options[randomnum].toLowerCase().equals("scissors")) {
            this.hScore++;
            System.out.println("I picked " + options[randomnum]);
            System.out.println("I gain one point total is: " + hScore);
            this.begin();

        } else if (choice.equals("scissors") && options[randomnum].toLowerCase().equals("rock")) {
                this.hScore++;

                System.out.println("I picked " + options[randomnum]);
                System.out.println("I gain one point total is: " + hScore);
                this.begin();
                System.out.println(options[randomnum]);

            }
            begin();
        }


    }

