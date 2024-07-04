class MenWatch{

static int caseDiameter = 40;
static String bandColour = "Brown";
static String bandMaterialType = "Leather";
static String warrantyType = "Manufacturer";
static String watchMovementType = "Quartz";
static int itemWeight = 52;
static String countryOfOrigin ="India";

public static void main(String[] fashion){

System.out.println("Main Started");
features();
System.out.println("Main ended");
}

public static void features(){
System.out.println("features method started");

System.out.println("caseDiameter is" + caseDiameter);
System.out.println("bandColour is" + bandColour);
System.out.println("bandMaterialType is" + bandMaterialType);
System.out.println("warrantyType is" + warrantyType);
System.out.println("watchMovementType is" + watchMovementType);
System.out.println("itemWeight is" +  itemWeight);
System.out.println("countryOfOrigin is" + countryOfOrigin);
System.out.println("features metod ended");
}
}