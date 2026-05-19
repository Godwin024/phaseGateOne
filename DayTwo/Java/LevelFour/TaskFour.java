public class TaskFour{

    public static void main(String[] args){
    
    int firstNumber = 7;
    int secondNumber = 3;
    int result = add(firstNumber,secondNumber );
    
    System.out.println(add(result));
    
    }



    public static int add(int firstNumber, int secondNumber){
    
        return firstNumber + secondNumber;
    
    }
    
    public static boolean  evenNumber( int number){
    
        if(number %2 == 0 ){
            return true;
        }
            return false;
    }
    
    public static int squareNumber(int number){
    
        return number * number;
    }
    
    public static double  celsiusConverter(double celsuis){
    
        return (9.0 / 5.0) * celsuis + 32;
    
    }
    
    public static boolean isPrime (int number){
    
        if(number <= 1){
        
        return false;
        }
        
        for (int count = 2; count <= number/2; count++){
            if(number %count == 0){
            return false;{
            
            }else {
                    return true;
                 }
            }
            return true;
            
        }
        
    }
    
    public static int largestNumber(int firstNumber, int secondNumber, int thirdNumber){
       
         int largest = firstNumber; 
         
         if(secondNumber > firstNumber &&  secondNumber > thirdNumber){
          largest = thirdNumber;
         } 
          return largest;       
         }
         
         
         
    public static double simpleInterest(int principal, int rate, int time ){
    
      return (principal * rate * time) / 100;
    }
    
    
    public static int areaOfTriangle(int length, int width){
    
        return length * width;
    }
    
    
        public static int reverseNumber (int number){
    
        int reverse = 0;
        while(number > 0){
        reverse = reverse * 10 + number %10;
        number /= 10;
        
        }
        return number;
    }
    
    
        public static String mostoccure (String word, char letter){
    
        int count = 0;
        for(int index = 0; index < word.length; index++ ){
            if(word.charAt(index) == letter )
            count++;
        }
        return count;
     
    }
    
    
    
        
    
    
    }


