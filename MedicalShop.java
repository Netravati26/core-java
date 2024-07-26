import java.util.Arrays;

class MedicalShop{
   static String medicineNames[] = {null,null,null,nuu,null,null,null,null,null,null};
   static int start;
   // Create Operation
   public static  boolean addMedicineName(String medicineName){
    boolean isMedicineNameAdded=false;
	
	if(start < MedicineNames.length){
   
     isMedicineNameAdded = true; 	   
	 }
	 else
	 System.out.println("Medicine Name is Invalid");
	}
	else{
		System.out.println("Medicine Names is full");
	}
	 
	return isMedicineNameAdded;
   
   }
   
   // Read Operation
   public static void showMedicineNames(){
   
   for(String medicineName : medicineNames){
	   System.out.println(medicineName);
   }
  
   }
   
   // Update Operation
   public static boolean updateMedicineName(String newMedicineName, String oldMedicineName){
	   
	   System.out.println("Update operation on Medicine name is started");
	   boolean isMedicineNameUpdated = false;
	   for(int position = 0; position < medicineNames.length ; position++ ){
		   if(medicineNames[position] == oldMedicineName){
			   medicineNames[position] = newMedicineName ;
			   isMedicineNameUpdated = true;
		   }
	   }
	   if(isMedicineNameUpdated == false)
		   System.out.println(oldMedicineName + " not found");
   
   System.out.println("Update operation on Medicine name is Ended");
   return isMedicineNameUpdated;
   }
   
   // Delete Operation
   public static boolean deleteMedicineName(String medicineName){
	   boolean isMedicineNameDeleted = false;
	   int position , newPosition;
	   for(position=0,newPosition=0;position<medicineNames.length;position++){
		   if(medicineNames[position]!=medicineName){
			   medicineNames[newPosition] = medicineNames[position];
			   newPosition++;
		   }
		   else isMedicineNameDeleted = true;
	   }
	   int newLength = newPosition;
	   medicineNames = Arrays.copyOf(medicineNames,newLength);
	   
	   if(isMedicineNameDeleted == false){
		   System.out.println(medicineName + "not found");
	   }
	   
	   return isMedicineNameDeleted;
   }
  
}