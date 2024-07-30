
import java.util.Arrays;

class CoffeePoint{
   static String coffeeNames[] = {null,null,null,null,null};
   static int start;
   // Create Operation
   public static  boolean addCoffeeName(String coffeeName){
    boolean isCoffeeNameAdded=false;
	
	if(start < coffeeNames.length){
   
     if(coffeeName !=null){
	 coffeeNames[start++]=coffeeName;
       //start ++;
     isCoffeeNameAdded = true; 	   
	 }
	 else
	 System.out.println("Coffee Name is Invalid");
	}
	else{
		System.out.println("Coffee Names is full");
	}
	 
	return isCoffeeNameAdded;
   
   }
   
   // Read Operation
   public static void showCoffeeNames(){
   
   for(String coffeeName : coffeeNames){
	   System.out.println(coffeeName);
   }
  
   }
   
   // Update Operation
   public static boolean updateCoffeeName(String newCoffeeName , String oldCoffeeName){
	   
	   System.out.println("Update operation on Coffee name is started");
	   boolean isCoffeeNameUpdated = false;
	   for(int position = 0; position < coffeeNames.length ; position++ ){
		   if(coffeeNames[position] == oldCoffeeName){
			   coffeeNames[position] = newCoffeeName ;
			   isCoffeeNameUpdated = true;
		   }
	   }
	   if(isCoffeeNameUpdated == false)
		   System.out.println(oldCoffeeName + " not found");
   
   System.out.println("Update operation on Coffee name is Ended");
   return isCoffeeNameUpdated;
   }
   
   // Delete Operation
   public static boolean deleteCoffeeName(String coffeeName){
	   boolean isCoffeeNameDeleted = false;
	   int position , newPosition;
	   for(position=0,newPosition=0;position<teaNames.length;position++){
		   if(coffeeNames[position]!=coffeeName){
			   coffeeNames[newPosition] = coffeeNames[position];
			   newPosition++;
		   }
		   else isCoffeeNameDeleted = true;
	   }
	   int newLength = newPosition;
	   coffeeNames = Arrays.copyOf(coffeeNames,newLength);
	   
	   if(isCoffeeNameDeleted == false){
		   System.out.println(coffeeName + "not found");
	   }
	   
	   return isCoffeeNameDeleted;
   }
  
}