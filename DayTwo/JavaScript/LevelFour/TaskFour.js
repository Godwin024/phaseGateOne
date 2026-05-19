


function  add( firstNumber, secondNumber){
    
        return firstNumber + secondNumber;
    
    }
    
function boolean  evenNumber( number){
    
        if(number %2 == 0 ){
            return true;
        }
            return false;
    }
    
 function  squareNumber( number){
    
        return number * number;
    }
    
function  celsiusConverter( celsuis){
    
        return (9.0 / 5.0) * celsuis + 32;
    
    }
function boolean isPrime (number){
    
        if(number <= 1){
        
        return false;
        }
        
        for (let count = 2; count <= number/2; count++){
            if(number %count == 0){
            return false;{
            
            }else {
                    return true;
                 }
            }
            return true;
            
        }
        
    }
    
function largestNumber( firstNumber, secondNumber, thirdNumber){
       
         let largest = firstNumber; 
         
         if(secondNumber > firstNumber &&  secondNumber > thirdNumber){
          largest = thirdNumber;
         } 
          return largest;       
         }
         
         
         
function simpleInterest( principal,  rate, time ){
    
      return (principal * rate * time) / 100;
    }
    
    
function areaOfTriangle(length,  width){
    
        return length * width;
    }
    
function reverseNumber ( number){
    
        let reverse = 0;
        while(number > 0){
        reverse = reverse * 10 + number %10;
        number /= 10;
        
        }
        return number;
    }
    
    
function String mostoccure (String word, char letter){
    
        let count = 0;
        for(let index = 0; index < word.length; index++ ){
            if(word.charAt(index) == letter )
            count++;
        }
        return count;
     
    }
    
    
    
        
    
    
    }


