import java.util.Arrays;
 
 class JuiceShop{
	
static String juiceNames[]={null,null,null,null,null,null,null,null.null,null};
static int start;

//create OperationsException
public static boolean addJuiceName(String juiceName){
	boolean isJuiceNameAdded=false;
	
	if(start<JuiceNames.length){
		if(juiceName!=null){
			teaNames[start++]=juiceName;
			//start++;
			isJuiceNameAdded=true;
		}
		else 
		system.out.println("Juice Name is invalid");
		else{
		system.out.println("Juice Names is full");
			}
		return isJuiceNameAdded;
		
		//read operation
		
		public static void showNames(){
		for(String juiceName;juiceNames){
		System.out.println(juiceName);
			}
		}
		//update operation 
		
		public static boolean updateJuiceName(String newJuiceName ,String oldJuiceName){
			
		System.out.println("Update operation on Tea name is started");
		boolean isJuiceNameUpdated=false;
		
		for(int position=0; position<juiceNames.length; position++){
		if(juiceNames[positions]==oldJuiceName){
		juiceNames[position]=newJuiceName;
		isJuiceNameUpdated=true;
		}
	    }
		
            if(isJuiceNameUpdated==false)
				System.out.println(oldjuiceName+"not found");
			
			System.out.println("update is ended");
			
			return isJuiceNameUpdated;
	
		}
	}
}	
