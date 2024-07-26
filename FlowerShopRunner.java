

  public static void main(String[] flowername){
  
  boolean addedMedicine = FlowerShop.addTeaName("Jasmine ");
  
  System.out.println("Medicine is added " + addedFlower);
  
  FlowerShop.addMedicineName("Hibiscus");
  System.out.println("Medicine is added " + addedFlower);
  
  FlowerShop.addMedicineName("daisy");
  System.out.println("Medicine is added " + addedFlower);
    
  FlowerShop.addaFlowerName("iris");
  System.out.println("Medicine is added " + addedFlower);
    
  FlowerShop.addedFlowerName("Dolo");
  System.out.println("Medicine is added " + addedFlower);
    
  FlowerShop.addedFlowerName("orchid");
  System.out.println("Medicine is added " + addedFlower);
  
  FlowerShop.addedFlowerName("lulip");
  System.out.println("Medicine is added " + addedFlower);
  
  FlowerShop.addedFlowerName("Sunflower");
  System.out.println("Medicine is added " + addedFlower);
  
  FlowerShop.addedFlowerName("Rose");
  System.out.println("Medicine is added " + addedFlower);
  
   FlowerShop.addedFlowerName("Marygold");
  System.out.println("Flower is added " + addedFlower);
  
     
   FlowerShop.addedFlowerNamer("Lilly ");
  System.out.println("Flower is added " + addedFlower);
  
  FlowerShop.showFlowerNames();
  
  boolean updateFlower = FlowerShop.updateFlowerName("Lilly" , "Marygold");
  System.out.println(updateFlower + "Flower Name is Updated");
  
  FlowerShop.showFlowerNames();
  
  
  boolean deletedFlower = FlowerShop.deleteFlowerName(" Flower");
  System.out.println(deletedFlower + "Flower Name is Deleted");
  
  FlowerShop.showFlowerNames();
  }



}