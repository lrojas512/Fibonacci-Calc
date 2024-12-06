
import java.util.*;
public class Lab6
{
    public static void main(String[] args)
    {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter the number you want to find the Fibonacci Series for: ");

        int userInput = myScan.nextInt();

        FibIteration f1 = new FibIteration();
        FibFormula f2 = new FibFormula();

        System.out.println("Fib of " + userInput + " by iteration is: " + f1.calculate_fib(userInput));
        System.out.println("Fib of " + userInput + " by formula is: " + f2.calculate_fib(userInput));
    }
}
