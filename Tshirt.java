class Tshirt{

static String materialComposition ="Cotton";
static String pattern ="Solid";
static String fitType = "Reglar Fit";
static String sleeveType ="Half Sleeve";
static String collarStyle = "Polo Collar";
static String lengthStandard = "Length";
static String countryOfOrigin ="India";

public static void main(String[] dress){
System.out.println("Main started");
details();
System.out.println("Main ended");
}

public static void details(){

System.out.println("details method started");
System.out.println("materialComposition is" +materialComposition);
System.out.println("pattern is" + pattern);
System.out.println("fitType is" + fitType);
System.out.println("sleeveType is" + sleeveType);
System.out.println("collarStyle is" + collarStyle);
System.out.println("lengthStandard is" + lengthStandard);
System.out.println("countryOfOrigin is" + countryOfOrigin);
System.out.println("details method ended");
}
}
