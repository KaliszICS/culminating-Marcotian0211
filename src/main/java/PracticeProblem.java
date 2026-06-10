import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

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
ArrayList<String> cards = new ArrayList<>();
ArrayList<String> cards1 = new ArrayList<>();
int number4=128;
int botlow=1;
int bothight=128;
boolean Confused = false;
//some rule of the game show.
    System.out.println("Welcome to the Small Card Game");
       System.out.println("The rule of the game:");
       System.out.println("This is a bot vs human game. You and the bot will get a random number.");
       System.out.println("If you guess the bot's number correctly, you win.");
       System.out.println("If the bot guesses your number first, the bot wins.");
       System.out.println("There also have three types card:range card,skip card,confuse card");
       System.out.println("Range card:show the bot number at a large range.Skip card:skip the bot round.\nConfuse card: make the bot get wrong range when bot use range card");
      System.out.println("Range(pro):this is use 2 range card to get more closer range of bot number.");
       System.out.println("Do you want to play game?");
        System.out.println("Do you want to play? (yes/no)");
        //ask plyer want the game yes or no.
        word1 = scanner.nextLine();
        //make sure the player enter word is lowercase.
        word1=word1.toLowerCase();
        //if player enter random word,the system will ask player enter again.
        while (!word1.equals("yes")
                && !word1.equals("no")) {
            System.out.println("Please enter yes or no:");
            word1 = scanner.nextLine();
            scanner.nextLine();
        }
        //if the player don't want play game.
        if (word1.equals("no")) {
            System.out.println("Game over,have a good day!");
            //this game will finish.
            return;
            //if player want to play,he will get a random number each game.
        }if(word1.equals("yes")){
        System.out.print("Your number is: " + number);
    
        do {
            System.out.println();
            //ask the player enter the number of guess.
            System.out.print("Please guess the bot's number:");
            number2 = scanner.nextInt();
            scanner.nextLine();
            //if the number equal the bot get,the game will over.
            if (number2 == number1) {
                System.out.println("You guessed correctly!");
                System.out.println("YOU WIN!");
                break;
            }

            System.out.println("You guessed wrong.");
            //number3 will get different number each round to determine which card that player will get.
            number3=random.nextInt(100)+1;
            //50% get range card.
if (number3 <= 50) {
            System.out.println("You got a Range Card.");
            //amount of range card  +1 in arraylist.
             cards.add("range");}
             //26% get skip card.
 if (number3 <= 76&&number3>=51) {
             System.out.println("You got a Skip Card.");
             //amount of skip card +1 in arraylist
             cards.add("skip");
             //24% get confuse card.
} if(number3<=100&&number3>76) {
             System.out.println("You got a Confuse Card.");
             //amount of confuse card +1 in arraylist
             cards.add("confuse");
}
          //show how many card you have in arraylist each round.
           System.out.println("Your cards: " + cards);
           //ask player want to use card or not
            System.out.println("Which card do you want to use? (range/range(pro)/skip/confuse/none)");
            word = scanner.nextLine();
          //if the player want to use range card,check the player have range card or not.
           if (word.equals("range") && cards.contains("range")) {
          //use one range card.
         cards.remove("range");

    if (number1 >= 64) {
        System.out.println("The bot's number is larger than 64");
    } else {
        System.out.println("The bot's number is lower than 64");}
    } 
    
    if (word.equals("range(pro)") && cards.contains("range")) {

        cards.remove("range");
        cards.remove("range");
//the code is run up to down,if number not smaller than 32,but smaller than 64,so the number will between 32 to 63.
            if (number1 < 32) {
            System.out.println("The bot's number is between 0 and 31"); }  
           else if (number1 < 64) {
            System.out.println("The bot's number is between 32 and 63"); } 
           else  if (number1 < 96) {
            System.out.println("The bot's number is between 64 and 95"); } 
            else if(number1<128) {
            System.out.println("The bot's number is between 96 and 127"); 
        }

    } 
    
    
     //if the player want to use skip card,check the player have skip card or not.
    if (word.equals("skip") && cards.contains("skip")) {
    //the skip card number-1.
    cards.remove("skip");
    System.out.println("Bot turn skipped.");
    //skip the rest part of do while loop,start a new loop.
    continue;
}
   //if the player want to use confuse card,check the player have skip card or not.
    if(word.equals("confuse") && cards.contains("confuse")){
    ////the skip card number-1.
    cards.remove("confuse");
    System.out.println("Bot will get false information next time!");
    //confuse be true will effect the bot use range card to get player range of number
       Confused = true;
}
//make bot guess random number each round.
     int botGuess = random.nextInt(bothight-botlow+1)+botlow;
    System.out.println("Bot guesses: " + botGuess);
    //if bot guess right of your number,the game over.
    if (botGuess == number) {
        System.out.println("Bot guessed your number!");
        System.out.println("BOT WINS!");
        break;
    }
    //bot only can get card or nothing.
    int number5=random.nextInt(100);
    if(number5<=50){
        cards1.add("range(bot)");
    }
    //if bot have range card it will use.
    if (cards1.contains("range(bot)")) {
        //the amount of range card number-1;
    cards1.remove("range(bot)");
    System.out.println("Bot used a Range Card!");
//if the player don't use confuse card to confuse the bot. 
if(Confused == false){
    //the bot can get correct range number.
    if (number >= 64) {
        System.out.println("Bot learned your number is >= 64");
        botlow=64;
    } if(number<64) {
        System.out.println("Bot learned your number is < 64");}
        bothight=64;
//if player use the confuse card.
     } if(Confused==true){ 
            //the bot get wrong range number.
        if (number < 64) {
        System.out.println("Bot learned your number is >= 64");
    } botlow=64;
    if(number>=64) {
 System.out.println("Bot learned your number is < 64");}
  bothight=64;
  //make sure the confuse card only effect once.
  Confused=false;

        }
    
}
}while (true);
        }
               
    } 
}

