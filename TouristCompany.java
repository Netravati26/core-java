import java.util.Arrays;
 
 class TouristCompany{
	
static String placeNames[]={null,null,null,null,null,null,null,null,null,null};
static int start;

//create OperationsException
public static boolean addPlaceName(String teaName){
	boolean isPlaceNameAdded=false;
	
	if(start<placeNames.length){
		if(placeName!=null){
			placeNames[start++]=placeName;
			//start++;
			isPlaceNameAdded=true;
		}
		else 
		system.out.println("Place Name is invalid");
		else{
		system.out.println("Place Names is full");
			}
		return isPlaceNameAdded;
		
		//read operation
		
		public static void showNames(){
		for(String placeName;placeNames){
		System.out.println(placeName);
			}
		}
		//update operation 
		
		public static boolean updatePlaceName(String newPlaceName ,String oldPlaceName){
			
		System.out.println("Update operation on Place name is started");
		boolean isPlaceNameUpdated=false;
		
		for(int position=0; position<placeNames.length; position++){
		if(placeNames[positions]==oldPlaceName){
		placeNames[position]=newPlaceName;
		isPlaceNameUpdated=true;
		}
	    }
		
            if(isPlaceNameUpdated==false)
				System.out.println(oldplaceName+"not found");
			
			System.out.println("update is ended");
			
			return isPlaceNameUpdated;
	
		}
	}
}	
