import java.util.Arrays;
public class MinimumNumber{

    public static void main(String [] args){
    
        int [] arrays = {14,9,6,5,8,10};
        
       System.out.println((getMinimum(arrays)));
        
    
    }
    
        public static int getMinimum(int [] arrays){
        
            int minimum = arrays[0];
            
            for(int index = 1; index < arrays.length; index++){
                if(arrays[index] < minimum){
                    minimum = arrays[index];
                }
            }
            return minimum;
        
        
        
        
        }


}
