class MedicalShop{


static String medicineNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start;

public static boolean addMedicineName(String medicineName){

  boolean isMedicineNameAdded = false;
  
  if(start<medicineNames.length){
  if(medicineName != null){
  medicineNames[start++] = medicineName;
  isMedicineNameAdded = true;
  }
  else
  System.out.println("MedicineName is Invalid");

}
else{
  System.out.println("Medicine Names is full");
}
return isMedicineNameAdded;

}
public static void showMedicineNames(){

for(String medicineName:juiceNames){
   System.out.println(medicineName);
}

}
}