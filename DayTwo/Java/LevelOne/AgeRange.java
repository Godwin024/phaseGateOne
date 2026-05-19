import java.util.Scanner;
public class AgeRange{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your age: ");
    
    int age = input.nextInt();
    
    int result = age + 5;
    
    System.out.println("Hello, you will be " + result + " years old in the next 5years.");
   
    
    
    }



}
