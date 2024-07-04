class Cable{

static String brand ="Ambrane";
static String connectorType =	"USB TypeC";
static String cableType = "USB";
static String specialFeature = "Compatible Devices Tablet ";
static String styleName= "Type C Cable";
static int price =180;

public static void main(String[] args){
System.out.println("Main Started");
details();
System.out.println("Main ended");
}

public static void details(){

System.out.println("details method started");

System.out.println("brand is" +brand);
System.out.println("connectorType is"+connectorType);
System.out.println("cableType is" + cableType);
System.out.println("specialFeature" +specialFeature);
System.out.println("styleName is" +styleName);
System.out.println("price is" +price);



System.out.println("details method ended");


}

}