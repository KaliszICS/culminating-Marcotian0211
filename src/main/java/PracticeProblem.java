import java.util.Scanner;

public class PracticeProblem {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
String word;
        System.out.println("Welcome to the Small Card Game");
        System.out.println("The rule of the game:");
        System.out.println("This is a bot vs human game. You and the bot will get a random number.");
        System.out.println("If you guess the bot's number correctly, you win.");
        System.out.println("If the bot guesses your number first, the bot wins.");
        System.out.println("do you want to play game?");
		word=scanner.nextLine();
		String word1=word.toLowerCase();
		while(word1!="yes"||word1!="no"){System.out.println("please enter \"yes\"or \"no\"");
if (word1=="no"){
System.out.print("have a good day");

}
}