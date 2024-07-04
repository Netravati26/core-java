class Product{

static String brand ="CIPLA PLAST";
static String color ="White";							    
static String material ="Glass, Plastic";
static String specialFeature = "Lightweight";
static String mountingType ="Wall Mount";
static String roomType ="Bathroom";
static String  doorStyle ="sliding";

public static void main(String[] brush){

System.out.println("Main Started");
details();
System.out.println("Main ended");

}

public static void details(){

System.out.println("details method started");

System.out.println("specialFeature" + specialFeature);
System.out.println("brand is" + brand);
System.out.println("roomType" + roomType);
System.out.println("material is" + material);
System.out.println("doorStyle" + doorStyle);
System.out.println("color is" + color);
System.out.println("mountingType" + mountingType);
System.out.println("details method ended");
}
}