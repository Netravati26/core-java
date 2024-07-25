class AmazonRunner{

 public static void main(String[] products){
 
   boolean addedProduct = Amazon.addProductName("SmartTv");
   System.out.println("Added product" + addedProduct );
   
   Amazon.addProductName("SmartWatch");
   System.out.println("Added product" + addedProduct);
   
   Amazon.addProductName("Fridge");
   System.out.println("Added product" + addedProduct );
   
   Amazon.addProductName("Umbrella");
   System.out.println("Added product" + addedProduct );
   
   Amazon.addProductName("Pooja Set");
   System.out.println("Added product" + addedProduct );
   
   Amazon.addProductName("Oven");
   System.out.println("Added product" + addedProduct );
   
   Amazon.addProductName("Watter Bottle");
   System.out.println("Added product" + addedProduct );
   
   Amazon.addProductName("Australia Clg Bag");
   System.out.println("Added product" + addedProduct );
   
   
   Amazon.addProductName("Lenovo Laptop");
   System.out.println("Added product" + addedProduct );
   
   Amazon.addProductName("Chocolate Making Kit");
   System.out.println("Added product" + addedProduct );
   
   Amazon.addProductName("Microwave");
   System.out.println("Added product" + addedProduct );
   
   Amazon.showProductNames();
 
 }




}