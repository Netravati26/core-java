class MedicalShopRunner{

  public static void main(String[] medicine){
  
  boolean addedMedicine = MedicalShop.addTeaName("Meftal Spas");
  
  System.out.println("Medicine is added " + addedMedicine);
  
  MedicalShop.addMedicineName("Adderall");
  System.out.println("Medicine is added " + addedMedicine);
  
  MedicalShop.addMedicineName("Paracetamol");
  System.out.println("Medicine is added " + addedMedicine);
    
  MedicalShop.addMedicineName("Atorvastatin");
  System.out.println("Medicine is added " + addedMedicine);
    
  MedicalShop.addMedicineName("Dolo");
  System.out.println("Medicine is added " + addedMedicine);
    
  MedicalShop.addMedicineName("Azithromycin");
  System.out.println("Medicine is added " + addedMedicine);
  
  MedicalShop.addMedicineName("Synarex");
  System.out.println("Medicine is added " + addedMedicine);
  
  MedicalShop.addMedicineName("Ativan");
  System.out.println("Medicine is added " + addedMedicine);
  
  MedicalShop.addMedicineName("Acetaminophen");
  System.out.println("Medicine is added " + addedMedicine);
  
   MedicalShop.addMedicineName("Imol");
  System.out.println("Medicine is added " + addedMedicine);
  
     
   MedicalShop.addMedicineName("Hydrochlorothiazide ");
  System.out.println("Medicine is added " + addedMedicine);
  
  MedicalShop.showMedicineNames();
  
  boolean updateMedicine = MedicalShop.updateMedicineName("Imol" , "Ativan");
  System.out.println(updateMedicine + "Medicine Name is Updated");
  
  MedicalShop.showMedicineNames();
  
  
  boolean deletedMedicine = MedicalShop.deleteMedicineName("Green Medicine");
  System.out.println(deletedMedicine + "Medicine Name is Deleted");
  
  MedicalShop.showMedicineNames();
  }



}