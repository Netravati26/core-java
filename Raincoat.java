class RainCoat{

static String materialComposition = "Polyster"; 
static String fitType ="Regular";
static String length ="Standard Length";
static String neckStyle ="Hooded Neck";
static String Pattern ="Solid";
static String countryOfOrigin ="India";
static String color ="Dark green";

public static void main(String[] rain){

System.out.println("Main started");
details();
System.out.println("Main ended"); 
}

public static void details(){

System.out.println("details method started");
System.out.println("materialComposition is" +materialComposition);
System.out.println("fitType is" + fitType);
System.out.println("length is" + length);
System.out.println("neckStyle is" + neckStyle);
System.out.println("Pattern is" +  Pattern);
System.out.println("countryOfOrigin is" + countryOfOrigin);
System.out.println("color is" + color);
System.out.println("details method ended");

}
}