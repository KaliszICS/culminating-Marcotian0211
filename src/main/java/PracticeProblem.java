import java.util.Scanner;
import java.util.Random;

public class PracticeProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String word;
        String word1;
int number=random.nextInt(128);//player number
int number1=random.nextInt(128);//bot number
int number2;
int number3;
int number4=128;
int range=0;
int skip=0;
int confuse=0;
int botLow=0;
int botHigh=100;
    System.out.println("Welcome to the Small Card Game");
       System.out.println("The rule of the game:");
       System.out.println("This is a bot vs human game. You and the bot will get a random number.");
       System.out.println("If you guess the bot's number correctly, you win.");
       System.out.println("If the bot guesses your number first, the bot wins.");
       System.out.println("do you want to play game?");


        System.out.println("Do you want to play? (yes/no)");
        word1 = scanner.nextLine();
        word1=word1.toLowerCase();
        while (!word1.equals("yes")
                && !word1.equals("no")) {

            System.out.println("Please enter yes or no:");
            word1 = scanner.nextLine();
        }

        if (word1.equals("no")) {
            System.out.println("Have a good day!");
            return;
        }
        System.out.println("Your number is: " + number);
        do {

            System.out.println();
            System.out.println("Please guess the bot's number:");
            number2 = scanner.nextInt();
            if (number2 == number1) {

                System.out.println("You guessed correctly!");
                System.out.println("YOU WIN!");
                break;
            }

            System.out.println("You guessed wrong.");

            number3 = random.nextInt(100) + 1;

            if (number3 <= 50) {

                System.out.println("You got a Range Card.");
                range++;
            } else if (number3>=50&&number3<=76) {

                System.out.println("You got a Skip Card.");
                skip++;

            } else {

                System.out.println("You got a Confuse Card.");
                confuse++;
            }

            System.out.println();
            System.out.println("Range Cards: " + range);
            System.out.println("Skip Cards: " + skip);
            System.out.println("Confuse Cards: " + confuse);

            scanner.nextLine();

            System.out.println(
                    "Which card do you want to use? (range/skip/confuse/none)");

            word = scanner.nextLine();

            if (word.equals("range") && range > 0) {
if(number1>=64){
                System.out.println( "The bot's number is larger than " + (64));
if(number1<64){ System.out.println( "The bot's number is lower than " + (64));

}
                range--;}
            }
                   if (word.equals("range 2") && range > 0){if(number1>=64&&number1<=96){
                System.out.println( "The bot's number is between 64 to96");
               if(number1<64&&number1>=32)
                System.out.println( "The bot's number is between 32 to 64");}
                range=range-2; }
                
            else if (word.equals("skip") && skip > 0) {

                System.out.println("Bot turn skipped.");
                skip--;
                continue;
            }

            else if (word.equals("confuse") && confuse > 0) {

                System.out.println("Bot is confused and will guess randomly.");

                confuse--;

                int botGuess = random.nextInt(128);

                System.out.println(
                        "Bot guesses: " + botGuess);

                if (botGuess == number) {

                    System.out.println(
                            "Bot guessed your number!");
                    System.out.println("BOT WINS!");
                    break;
                }

                continue;
            }

            int botGuess = (botLow + botHigh) / 2;

            System.out.println();
            System.out.println(
                    "Bot guesses: " + botGuess);

            if (botGuess == number) {

                System.out.println(
                        "Bot guessed your number!");

                System.out.println("BOT WINS!");
                break;
            }

            if (botGuess < number) {

                botLow = botGuess + 1;

            } else {

                botHigh = botGuess - 1;
            }

        } while (true);
    }
}
