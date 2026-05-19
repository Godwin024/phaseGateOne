import java.util.Scanner;
public class TaskSix{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
      
   
        int sum = 0;
        
    for(int count = 1; count <= 5; count++){ 
         System.out.println("Enter your number: ");
         int number = input.nextInt();
         
         sum += number;       
                
                 }
                    System.out.println("The sum of 5 numbers is " + sum);
                
    
            }
    
    
        
        }


