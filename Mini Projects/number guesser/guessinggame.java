
import java.util.Scanner;

public class guessinggame {
    public static void game(){
        Scanner object= new Scanner(System.in);
        int number= 1 + (int)(100 *(Math.random()));
        int k= 5;
        int i, guess;
        System.out.println("Guess a number and if you are correct" + "you win a wink from aditya");
        
        for(i=0; i<k ; i=i++){
            System.out.println("Take a guess: ");
            guess= object.nextInt();
            if(guess == number){
                System.out.println("You guessed the number correctly");
                break;
            }
            else if(guess < number && i!=k-1){
                System.out.println("your guess is lesser than actual number");
            }
            else if(guess > number && i!=k-1){
                System.out.println("your guess is greater than the actual number");
            }
        }
        if(i==k){
            System.out.println("you have exceeded the trials");
            System.out.println("The number was" + number);
        }
    }

public static void main(String[] args){
        game();
    }
  }
