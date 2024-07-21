class PassportGeneration{
	
	
static String cpvLoc;
static String dcdLoc;
static String gName;
static String sN;
static String db;
static String eml;
static boolean emllog;
static String emailloginId;
static String pw;
static String cfswd;
static String hqs;
static String an;
static String cap;


 
public static boolean createUserPassport(String cpvLocation,String dcdLocation,String givenName,String surname ,String dob,String email,boolean emailloginSame,String emailloginId,String pwd,String Confirmpwd,String hintQsn,String Ans,String captha )
{
 boolean isPasswordCreated =false;

  cpvLoc=cpvLocation;
  dcdLoc=dcdLocation;
 gName=givenName;
 sN=surname;
 db=dob;
  eml=email;
 emllog=emailloginSame;
 emailloginId=emailloginId;
  pw=pwd;
 cfswd=Confirmpwd;
 hqs=hintQsn;
 an=Ans;
 cap=captha;
 
 System.out.println("printoing in first method.."+cpvLoc);
 
 readUsrePasswordDetails();
 
	return isPasswordCreated ;
}
public static boolean readUsrePasswordDetails(){
	System.out.println("fetching... User Details");
	
	System.out.println("The user CPV Location"+cpvLoc);
	System.out.println("The DCD Location is"+dcdLoc);
	System.out.println("The given name is"+gName);
    System.out.println("The Surname is"+sN);
	System.out.println("The dob"+db);
	System.out.println("The email is"+eml);
	System.out.println("The EmailloginSame"+emllog);
	System.out.println("The EmailloginId"+emailloginId);
	System.out.println("The Pwd is"+pw);
	System.out.println("The Confirmpwd is"+cfswd);
	System.out.println("The HintQsn is"+hqs);
	System.out.println("The ans is"+an);
	System.out.println("The captha is"+cap);
	
	return true;
}
 
}