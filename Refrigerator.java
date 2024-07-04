class Refrigerator{

static float productDimensions =63.6f;
static String brand =	"Godrej";
static int capacity = 223 ;
static String configuration ="Double Door";
static int energyStar = 3;
static String color = "Silver";
static String type = "Double Door";

public static void main(String[] cool){

System.out.println("Main starrted");
details();
System.out.println("Main ended");
}

public static void details(){
System.out.println("details method started");
System.out.println("productDimensions" + productDimensions);
System.out.println("brand is" + brand);
System.out.println("capacity is" +capacity);
System.out.println("configuration is" + configuration);
System.out.println("energyStar"+ energyStar);
System.out.println("color is" + color);
System.out.println("type is" + type);
System.out.println("details method ended");

}
}