import java.util.Scanner;

public class TaskThree{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your score: ");
    
    int score = input.nextInt();
    
    if(score >= 50){
    System.out.println("Pass");
    
    } else {
    System.out.println("Fail");
 
     }


}

}
