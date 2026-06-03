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
            System.out.println("You guess wrong")
          
            
        
        }
    
        }
    }
}

    }
}
