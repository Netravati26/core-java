class GamePad{

static int itemModelNumber =‏ 57;
static String countryOfOrigin ‏= ‎"China";
static String batteries ‏="Lithium Ion Batteries ";
static String language ‏ ="English";
static String includedComponents ‏="Gamepad, Charging Cable, USB Dongle, User manual";
static String genericName ‏ =‎"Gamepad";

public static void main(String[] game){
System.out.println("Main started");
details();
System.out.println("Main ended");
}

public static void details(){
System.out.println("details method started");

System.out.println("itemModelNumber is" +itemModelNumber);
System.out.println("countryOfOrigin is" +countryOfOrigin);
System.out.println("batteries is" + batteries);
System.out.println(" language is" + language);
System.out.println("includedComponents are" + includedComponents);
System.out.println("genericName is" +genericName);


System.out.println("details method ended");
}
}