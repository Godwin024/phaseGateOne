import java.util.Scanner;

public class TaskFour{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your first number: ");
    
    int firstNumber = input.nextInt();
    
      
    System.out.println("Enter your second number: ");
    
    int secondNumber = input.nextInt();
    
          
    System.out.println("Enter your third number: ");
    
    int thirddNumber = input.nextInt();
    
    int largest = firstNumber;
    
    if (largest > secondNumber){
       largest = thirddNumber;
       System.out.println("This is your largest number: " + largest);
    }

}

}
