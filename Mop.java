class Mop{

static String color = "White";
static String material= "Plastic";
 static String shandleMaterial = "Stainless Steel";
 static String handleType = "Telescopic";
 static String headMaterial =	"Microfiber";

public static void main (String[] clean){

System.out.println("Main started");
details();

System.out.println("Main ended");
}

public static void details(){

System.out.println("details method started");

System.out.println("color is" +color);
System.out.println("material is" + material);
System.out.println("shandleMaterial is" +shandleMaterial);
System.out.println("handleType is" + handleType);
System.out.println("headMaterial is" + headMaterial);


System.out.println("details method ended");
}
}