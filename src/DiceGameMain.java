import java.util.Scanner;
public class DiceGameMain
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        Dice oneDice = new Dice(1, 6);
        Dice twoDice = new Dice(1, 12);
        Dice threeDice = new Dice(1, 18);
        int compRoll; //use this to make sure the numbers are accurate
        String a1 = "This is a game of dice where you guess ";
        String a2 = "if the roll will be odd or even.";
        String a3 = "How many dices do you want to roll?";
        String a4 = "Enter 1 for 1 dice, 2 for 2 dice, or 3 for 3 dice.";
        
        System.out.printf("%s%s%n%s%n%s%n", a1, a2, a3, a4);
        int userDiceChoice = input.nextInt();
       
        
       if ((userDiceChoice < 1) || (userDiceChoice >3))
       {
           System.out.println("Please enter either 1, 2, or 3.");
       }
        else
        {
        if (userDiceChoice == 1)
            {
                
                compRoll = oneDice.GetANumber();
                System.out.println("Guess if the roll will be odd or even, use 1 for odd and 2 for even: " + compRoll);
                int userGuess = input.nextInt();
                    if ((userGuess == 2 && compRoll %2 == 0))
                    {
                        System.out.println("You guessed correct.");
                    }
                
                    else if ((userGuess == 1 && compRoll == 1) || (userGuess == 1 && compRoll == 3) || (userGuess == 1 && compRoll == 5))
                    {
                        System.out.println("You guessed correct.");
                    }
                
                    else if ((userGuess == 1 && compRoll %2 == 0))
                    {
                        System.out.println("You guessed incorrect.");
                    }
                
                    else if ((userGuess < 1) || (userGuess > 2))
                    {
                        System.out.println("Sorry you can only use 1 or 2.");
                    }
                    
                    else 
                    {
                        System.out.println("You guessed incorrect.");
                    }
                
                
                
            }
        else if (userDiceChoice == 2)
            {
                compRoll = twoDice.GetANumber();
                System.out.println("Guess if the roll will be odd or even, use 1 for odd and 2 for even: " + compRoll);
                int userGuess = input.nextInt();
                    if ((userGuess == 2 && compRoll %2 == 0))
                    {
                        System.out.println("You guessed correct.");
                    }
                
                    else if ((userGuess == 1 && compRoll == 1) || (userGuess == 1 && compRoll == 3) || (userGuess == 1 && compRoll == 5) || (userGuess == 1 && compRoll == 7) || (userGuess == 1 && compRoll == 9) || (userGuess == 1 && compRoll == 11))
                    {
                        System.out.println("You guessed correct.");
                    }
                
                    else if ((userGuess == 1 && compRoll %2 == 0))
                    {
                        System.out.println("You guessed incorrect.");
                    }
                
                    else if ((userGuess < 1) || (userGuess > 2))
                    {
                        System.out.println("Sorry you can only use 1 or 2.");
                    }
                    
                    else 
                    {
                        System.out.println("You guessed incorrect.");
                    }
            }
        else
            {
                compRoll = threeDice.GetANumber();
                System.out.println("Guess if the roll will be odd or even, use 1 for odd and 2 for even: " + compRoll);
                int userGuess = input.nextInt();
                    if ((userGuess == 2 && compRoll %2 == 0))
                    {
                        System.out.println("You guessed correct.");
                    }
                
                    else if ((userGuess == 1 && compRoll == 1) || (userGuess == 1 && compRoll == 3) || (userGuess == 1 && compRoll == 5) || (userGuess == 1 && compRoll == 7) || (userGuess == 1 && compRoll == 9) || (userGuess == 1 && compRoll == 11) || (userGuess == 1 && compRoll == 13) || (userGuess == 1 && compRoll == 15) || (userGuess == 1 && compRoll == 17))
                    {
                        System.out.println("You guessed correct.");
                    }
                
                    else if ((userGuess == 1 && compRoll %2 == 0))
                    {
                        System.out.println("You guessed incorrect.");
                    }
                
                    else if ((userGuess < 1) || (userGuess > 2))
                    {
                        System.out.println("Sorry you can only use 1 or 2.");
                    }
                    
                    else
                    {
                        System.out.println("You guessed incorrect.");
                    }
            }
        }
        
        
        
        
        }
    
}