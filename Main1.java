
import java.util.Scanner;
import java.util.Random;
class Game
{
    public int guesses=0;
    public int number;
    public int userInput;
    Game()
    {
        Random random=new Random();
        this.number=random.nextInt(100);
    }
    public void takeUserInput()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any number from 0 to 99 first:");
        this.userInput=scan.nextInt();
    }
    boolean isCorrectNumber()
    {
        guesses++;
        if(number==userInput)
        {
            System.out.println("Congrats!! You have guessed the correct number.");
            System.out.println("The correct number is: "+number);
            System.out.println("Total number of guesses: "+guesses);
            return true;
        }
        else if(number>userInput)
        {
            System.out.println("Too low...");
        }
        else if(number<userInput)
        {
            System.out.println("Too high...");
        }
        return false;
    }
}
public class Main1 
{
    public static void main(String[] args)
    {
        Game game=new Game();
        boolean bool=false;
        while(!bool)
        {
            game.takeUserInput();
            bool=game.isCorrectNumber();
        }
    }
}