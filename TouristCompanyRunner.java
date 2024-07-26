class TouristCompanyRunner{

  public static void main(String[] places){
  
  boolean addedPlace = TouristCompany.addPlaceName("Ayodhhya");
  System.out.println("Place is added " + addedPlace);
  
  TouristPlace.addPlaceName("Kukke");
  System.out.println("Place is added " + addedPlace);
  
  TouristPlace.addPlaceName("Dharmastala");
  System.out.println("Place is added " + addedPlace);
  
  TouristPlace.addPlaceName("Shivamogga");
  System.out.println("Place is added " + addedPlace);
  
  TouristPlace.addPlaceName("Agumbe");
  System.out.println("Place is added " + addedPlace);
  
   TouristPlace.addPlaceName("Coorg");
  System.out.println("Place is added " + addedPlace);
  
     TouristPlace.addPlaceName("Ayodhhya");
  System.out.println("Place is added " + addedPlace);
  
     TouristPlace.addPlaceName("Mysore");
  System.out.println("Place is added " + addedPlace);
    
     TouristPlace.addPlaceName("DK");
  System.out.println("Place is added " + addedPlace);

     TouristPlace.addPlaceName("Sirsi");
  System.out.println("Place is added " + addedPlace);
  
     TouristPlace.addPlaceName("Badami");
  System.out.println("Place is added " + addedPlace);
     
  TouristPlace.showPlaceNames();
  
  boolean updatePlace = TouristPlace.updatePlaceName("Sirsi" , "Badami");
  System.out.println(updatePlace + "Place Name is Updated");
  
  TouristPlace.showPlaceNames();
  
  
  boolean deletedPlace = TouristPlace.deleteTeaName("Agumbe");
  System.out.println(deletedPlace + "Place Name is Deleted");
  
  TouristPlace.showPlaceNames();
  }



}