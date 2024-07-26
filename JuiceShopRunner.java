 class JuiceShopRunner{ 
 
  public static void main(String[] juices){
  
  boolean addedJuice = JuiceShop.addJuiceName("Apple Jiuce");
  System.out.println("Juice is added " + addedJuice);
  
  JuiceShop.addJuiceName("Lime Jiuce");
  System.out.println("Juice is added " + addedJuice);
  
  JuiceShop.addJuiceName("Pomogranate Juice");
  System.out.println("Juice is added " + addedJuice);
  
  JuiceShop.addJuiceName("Kivi Jiuce");
  System.out.println("Juice is added " + addedJuice);
  
  JuiceShop.addJuiceName("Orange Jiuce");
  System.out.println("Juice is added " + addedJuice);
  
   JuiceShop.addJuiceName("Banana Juice");
  System.out.println("Juice is added " + addedJuice);
  
     JuiceShop.addJuiceName("GrapeFruit Juice");
  System.out.println("Juice is added " + addedJuice);
  
       JuiceShop.addJuiceName("Watermelon Juice");
  System.out.println("Juice is added " + addedJuice);
  
     JuiceShop.addJuiceName("Mango Juice");
  System.out.println("Juice is added " + addedJuice);
  
     JuiceShop.addJuiceName("Cherry Juice");
  System.out.println("Juice is added " + addedJuice);
  
JuiceShop.addJuiceName("Straberry Juice");
  System.out.println("Juice is added " + addedJuice);
  
     
  JuiceShop.showJuiceNames();
  
  boolean updateJuice = JuiceShop.updateTeaName("Mango Juice" , "Straberry Juice");
  System.out.println(updateJuice + "Juice Name is Updated");
  
  JuiceShop.showJuiceNames();
  
  
  boolean deletedJuice = JuiceShop.deleteJuiceName("Mango Jiuce");
  System.out.println(deletedJuice + "Juice Name is Deleted");
  
  JuiceShop.showJuiceNames();
  }



}