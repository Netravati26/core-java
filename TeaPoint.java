import java.util.Arrays;
 
 class TeaPoint{
	
static String teaNames[]={null,null,null,null,null,null};
static int start;

//create OperationsException
public static boolean addTeaName(String teaName){
	boolean isTeaNameAdded=false;
	
	if(start<teaNames.length){
		if(teaName!=null){
			teaNames[start++]=teaName;
			//start++;
			isTeaNameAdded=true;
		}
		else 
		system.out.println("Tea Name is invalid");
		else{
		system.out.println("Tea Names is full");
			}
		return isTeaNameAdded;
		
		//read operation
		
		public static void showNames(){
		for(String teaName;teaNames){
		System.out.println(teaName);
			}
		}
		//update operation 
		
		public static boolean updateTeaName(String newTeaName ,String oldTeaName){
			
		System.out.println("Update operation on Tea name is started");
		boolean isTeaNameUpdated=false;
		
		for(int position=0; position<teaNames.length; position++){
		if(teaNames[positions]==oldTeaName){
		teaNames[position]=newTeaName;
		isTeaNameUpdated=true;
		}
	    }
		
            if(isTeaNameUpdated==false)
				System.out.println(oldteaName+"not found");
			
			System.out.println("update is ended");
			
			return isTeaNameUpdated;
	
		}
	}
}	



	
	