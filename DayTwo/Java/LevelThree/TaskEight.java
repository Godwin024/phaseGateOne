import java.util.Scanner;
public class TaskEight{

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);  
   
        int sum = 0;
        int count = 0;
        
    while(true){ 
         System.out.println("Enter your number press 0 to stop: " );
         int number = input.nextInt();
         
         sum += number;   
         if(number == 0){
         break;
         }   
        
                 }
                
                 System.out.println(sum);
                
   
            }
    
    
        
        }


