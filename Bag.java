class Bag{


static String closureType ="Zipper";
static String outerMaterial = "Polyurethane";
static String style = "Handbag";
static String occasionType = "Casual";
static int numberOfPockets = 2;
static String liningFaux = "Leather";
static String countryOfOrigin ="India";

public static void main(String[] bags){

System.out.println("Main Started");
details();
System.out.println("Main ended");
}

public static void details(){

System.out.println("details smethod started");

System.out.println("closureType is" + closureType);

System.out.println("outerMaterial is" + outerMaterial);

System.out.println("style is" + style);

System.out.println( "occasionType is" + occasionType );

System.out.println("numberOfPockets are" + numberOfPockets);

System.out.println("liningFaux is" + liningFaux);

System.out.println("countryOfOrigin is" +countryOfOrigin);

System.out.println("details method ended");
}
}





