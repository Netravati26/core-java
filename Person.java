class Person{

   static String name = "kushi";
   static int age = 27;
  static float weight = 45;
  static long phoneNo = 94895678;
  static String place = "Bengaluru";
   static String education = "Bsc";
   
public static void main(String[] personname){

System.out.println("Main Started");

details();
System.out.println("Main ended");
  }
  
  
public static void details(){
System.out.println("details method started");
  
  
System.out.println("name is" + name);
System.out.println("age is" + age);
System.out.println("weight is" + weight);
System.out.println("phoneNo is" + phoneNo );
System.out.println("place is" + place);
System.out.println("education is" +education );

System.out.println("details method ended");

}


}