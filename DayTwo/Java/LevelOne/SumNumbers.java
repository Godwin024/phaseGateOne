import java.util.Scanner;
public class SumNumbers{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your firstNumber: ");
    int firstNumber = input.nextInt();
    
    System.out.println("Enter your secondNumber: ");
    int secondNumber = input.nextInt();
    
    int sum = firstNumber + secondNumber;
    
    System.out.println("Your sum of number is " + sum);
    
    
    
    
     }



}
