public class MiniParkingSlot{

    public static void main(String[] args){
    
        int [] slots = new int [20];    
    }
    
    
    
    public static int parkingSlot(int [] slots){
    
        int slotPark = 1;
        
        for(int index = 0; index < slots.length; index++){
            if(slots[index] ==  0){
                slots[index] = slotPark;
                slotPark++;
            }
        
        
        }
        return slotPark;
    
        
    }

}
