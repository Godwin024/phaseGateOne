import java.util.Scanner;
import java.util.Arrays;
public class ArrayAndNumber{

    public static void main(String [] args){

    
        int [] arrays = {8,6,12,4,-2}; 
        int targetNumber = 6;
        
        int [] numbers = {1,2,5,7,6,8,9};
        int targetSumNumber = 12;
    System.out.println(Arrays.toString(getArraysNumber(arrays, targetNumber)));
    System.out.println(Arrays.toString(getSumOfNumbers(numbers, targetSumNumber)));
    
    }
    
    public static int [] getArraysNumber(int [] arrays, int targetNumber){
            int[] numberCount = {};
            
            for(int count = 0; count < arrays.length; count++){         
               for(int index = count +1; index < arrays.length; index++){
               
                    if(arrays[count] + arrays[index] == targetNumber){
                        numberCount = new  int [] {arrays[count], arrays[index]};
                        
                        return numberCount;
                        
                    }
               }
            }
            return numberCount;
        
    
    }
    
    public static int [] getSumOfNumbers(int [] numbers, int targetSumNumber){
        int [] sumNumber = {};
        
        for(int count = 0; count < numbers.length; count++){
            for(int index = count +1; index < numbers.length; index ++){
            
                if(numbers[count] + numbers[index] == targetSumNumber){
                    sumNumber = new int [] {numbers[count], numbers[index]};
                    
                    return sumNumber;
                }
            }
        }
        return sumNumber;
        
    }



}
