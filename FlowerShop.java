
import java.util.Arrays;

class FlowerShop{
   static String flowerNames[] = {null,null,null,null,null,null,null,null,null,null};
   static int start;
   // Create Operation
   public static  boolean addFlowerName(String teaName){
    boolean isFlowerNameAdded=false;
	
	if(start < flowerNames.length){
   
     isFlowerNameAdded = true; 	   
	 }
	 else
	 System.out.println("Flower Name is Invalid");
	}
	else{
		System.out.println("Flower Names is full");
	}
	 
	return isFlowerNameAdded;
   
   }
   
   // Read Operation
   public static void showFlowerNames(){
   
   for(String flowerName : flowerNames){
	   System.out.println(flowerName);
   }
  
   }
   
   // Update Operation
   public static boolean updateFlowerName(String newFlowerName , String oldFlowerName){
	   
	   System.out.println("Update operation on Flower name is started");
	   boolean isFlowerNameUpdated = false;
	   for(int position = 0; position < flowerNames.length ; position++ ){
		   if(flowerNames[position] == oldFlowerName){
			   flowerNames[position] = newFlowerName ;
			   isFlowerNameUpdated = true;
		   }
	   }
	   if(isFlowerNameUpdated == false)
		   System.out.println(oldFlowerName + " not found");
   
   System.out.println("Update operation on Flower name is Ended");
   return isFlowerNameUpdated;
   }
   
   // Delete Operation
   public static boolean deleteFLowerName(String flowerName){
	   boolean isFlowerNameDeleted = false;
	   int position , newPosition;
	   for(position=0,newPosition=0;position<flowerNames.length;position++){
		   if(flowerNames[position]!=flowerName){
			   flowerNames[newPosition] = flowerNames[position];
			   newPosition++;
		   }
		   
		   else isFlowerNameDeleted=true;
		 
	   }
	   int newLength = newPosition;
	   flowerNames = Arrays.copyOf(flowerNames,newLength);
	   
	   if(isFlowerNameDeleted == false){
		   System.out.println(flowerName + "not found");
	   }
	   
	   return isFlowerNameDeleted;
   }
  
}