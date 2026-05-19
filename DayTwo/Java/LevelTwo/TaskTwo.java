import java.util.Scanner;

public class TaskOne{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number: ");
    
    int number = input.nextInt();
    
    if(number > 0 ){
    System.out.println("Positive");
    
    } else if(number < 0 ){
    System.out.println("negative");
    
    } else {
    System.out.println("Invalid");
         }
    
    }


}
