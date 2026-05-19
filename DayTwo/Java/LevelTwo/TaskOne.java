import java.util.Scanner;

public class TaskOne{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number: ");
    
    int number = input.nextInt();
    
    if(number %2 == 0 ){
    System.out.println("Even");
    
    } else if(number %2 != 0){
    System.out.println("Odd");
    
    } else {
    System.out.println("Invalid");
         }
    
    }


}
