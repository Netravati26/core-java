class Socks{
  
static String materialComposition ="Cotton Blend";
static String careInstructions ="Machine Wash";
static String pattern ="Solid";
static String toeStyle ="Thump";
static String countryOfOrigin ="India";
static int price = 265;
static String color = "pink";

public static void main(String[] cutesocks){
System.out.println("Main Started");
properties();
System.out.println("Main ended");

}

public static void properties(){

System.out.println("properties method started");

System.out.println("materialComposition is" + materialComposition);
System.out.println("careInstructions" + careInstructions);
System.out.println("pattern is" + pattern);
System.out.println("toeStyle is" + toeStyle);
System.out.println("countryOfOrigin is" + countryOfOrigin);
System.out.println(" price is" + price);
System.out.println("color is" + color);

System.out.println("properties method ended");

}
}
