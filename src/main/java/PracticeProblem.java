import java.util.Scanner;
import java.util.Random;

public class PracticeProblem {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    Random random=new Random();
String word;
int number=random.nextInt(128);
int number1=random.nextInt(128);
int number2;
int number3=random.nextInt(100);
int number4=random.nextInt(100);//bot number
int number5=random.nextInt(100);
int range=0;
int skip=0;
int confuse=0;
String word1;
        System.out.println("Welcome to the Small Card Game");
        System.out.println("The rule of the game:");
        System.out.println("This is a bot vs human game. You and the bot will get a random number.");
        System.out.println("If you guess the bot's number correctly, you win.");
        System.out.println("If the bot guesses your number first, the bot wins.");
        System.out.println("do you want to play game?");
		word=scanner.nextLine();
		String word1=word.toLowerCase();
		while(word1!="yes"||word1!="no"){System.out.println("please enter \"yes\"or \"no\"");
    }
if (word1=="no"){
System.out.print("have a good day");
if(word1=="yes"){ System.out.println("your number is "+number);

    do{
        System.out.println("Please guess enter a number:");
        number2=scanner.nextInt();
        if(scanner.hasNextInt()&&number2!=number1){
            System.out.println("You guess wrong");
          if(number3<=50){
            System.out.print("you get range card");
            range++;
          }
          if(number3<=76){
           System.out.print("you get skip card");
           skip++;
          }
          if(number3<=100){
            System.out.print("you get confuse card");
            confuse++;
          }
          System.out.print("would you want to use the which card?");
           word1=scanner.nextLine();
         if(word=="range card"){
         System.out.println("the range number of the oppensent is:"+number1/2);
         range--;
         }
         if(word=="skip card"&&skip>=2){
            System.out.println("the bot round was skip.");
            skip=skip-2;
           }
           if(word=="confuse"){
            System.out.println("the bot get the wrong range of number");
            confuse--;
           }
            
        
        }
    
        }while(number2==number4);
        
    }

}

    }
}
