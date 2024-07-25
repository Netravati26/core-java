
class FlowerShop{

static String flowerNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start;

public static boolean addFlowerName(String flowerName){

  boolean isFlowerNameAdded = false;
  
  if(start<flowerNames.length){
  if(flowerName != null){
  flowerNames[start++] = flowerName;
  isFlowerNameAdded = true;
  }
  else
  System.out.println("FlowerName is Invalid");

}
else{
  System.out.println("Flower Names is full");
}
return isFlowerNameAdded;

}
public static void showFlowerNames(){

for(String flowerName:flowerNames){
   System.out.println(flowerName);
}

}

}