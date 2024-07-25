class JuiceShopRunner{

 public static void main(String[] juices){
 
   boolean addedJuice = JuiceShop.addJuiceName("WaterMelon");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("Lime");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("Orange");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("Apple");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("Pomogranate");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("Lemon");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("Orange");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.showJuiceNames();
 
 }




}