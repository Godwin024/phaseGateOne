import java.util.Scanner;
public class CelsiusToFahrenheit{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your temperature in celsius: ");
    double celsius = input.nextDouble();
    
    
    double fahrenhieit = (9.0 / 5.0) * celsius + 32;
    
    System.out.println("Your temperature is " + fahrenhieit);
    
   
    
     }



}
