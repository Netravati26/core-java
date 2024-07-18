class RechargePlansRunner{


public static void main(String[] communication){



System.out.println("Main Started");


String planName = "50GB Data for Existing Pack";

double price = RechargePlans.find(planName)

System.out.println("the price is"+ price);


System.out.println("Main ended");
}
}
