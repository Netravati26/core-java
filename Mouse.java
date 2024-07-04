class Mouse{


static String brand =	"ZEBRONICS";
static String colour = "Black";
static String connectivityTechnology ="USB";
static String specialFeature = "Ergonomic Design, LED Lights, Optical Sensor";
static String movementDetection = "Technology Optica";
static int price =350;

 public static void main(String[]key){
 System.out.println("Main started");
 details();
 System.out.println("Main ended");
 }
 
 public static void details(){
System.out.println("details method started");
System.out.println("brand is" + brand);
System.out.println("colour is" + colour);
System.out.println("connectivityTechnology" + connectivityTechnology);
System.out.println("specialFeature" + specialFeature);
System.out.println("movementDetection" + movementDetection);
System.out.println("price" +price);

 System.out.println("details method ended");
 }
}