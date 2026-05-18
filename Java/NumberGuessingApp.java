import java.util.Scanner;

public class NumberGuessingApp{

    public static void main(String[] args){

       int number = (int)(Math.random() * 101);
        
        Scanner input = new Scanner(System.in); 
        
        
        int tryguessNumber = 1;
    
        
        while(true){
        
        System.out.printf("Enter your guess number %d: ", tryguessNumber);
        int guessNumber = input.nextInt();
        
        if (guessNumber == number){
        System.out.println("Yes, the number is " + number);
        
        }       
        else if (guessNumber > number){
        System.out.println("Your guess is too high ");
        
        }else{
        System.out.println("Your guess is too low ");
        
          }

        if(tryguessNumber == 5){
        break;
        
        } tryguessNumber++;
        
        if(guessNumber < 1){
        System.out.println("Error");
        
        }else if(guessNumber > 100){
        
        System.out.println("Please enter a number in range 1-100");
        } continue;
        
        
        }  
       
        
    
    }

}
