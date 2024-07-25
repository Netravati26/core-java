class TouristPlace{

static String placeNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start;

public static boolean addPlaceName(String placeName){

boolean isPlaceNameAdded = false;

if(start<placeNames.length){
  if(placeName != null){
  placeNames[start++] = placeName;
  isPlaceNameAdded = true;
  }
  else
  System.out.println("PlaceName is Invalid");

}
else{
  System.out.println("Place Names is full");
}
return isPlaceNameAdded;

}
public static void showPlceNames(){

for(String placeName:placeNames){
   System.out.println(placeName);
}

}
}




































