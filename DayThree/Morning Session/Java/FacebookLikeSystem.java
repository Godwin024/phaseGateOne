
public class FacebookLikeSystem{

    public static void main(String [] args){
    
        String [] names = {"Peter", "Jacob", "Alex", "Max", "John", "Mark" };
        String newLikes = getLikeNames(names);
        System.out.println(newLikes);
        
    
    }
    
    public static String getLikeNames(String [] names){
        for(String index : names){
            if(names.length < 1){
                return ("no one likes this");
            }
             else if (names.length == 1){
                    return (names + " Likes this");
                    
             } 
             else if(names.length  == 2){
                    return (names[0] + "and " + names[1] + "Likes this");
                    
             }
             else if(names.length == 3){
                return (names[0] + "," + names [1] + "and" + names [2] + "Likes this");
             } 
             else if(names.length == 4){
                int remaining = names.length;
                return (names[0] + "," + names [1] + "and " + remaining + "others Likes this");
             }
                      
            
        }
        return ("no one Likes this");
    
            
        
    
    }
}
