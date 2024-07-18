class Zomato{

public static double find(String foodName){

if (foodName == "Burger Combo for 2: Mcveg Burger"){
return 391.43;
}

if (foodName == "20 Pc Chicken Nuggets"){
return 423.83;
}

if(foodName == "Salsa Cheese Fries"){
return 135.24 ;
}

if(foodName == "Fries (Large)"){
return 139.05 ;
}

if(foodName == "Classic Cheese Fries"){
  return 157.14 ;
 }
  
if (foodName == "Veg Pizza McPuff"){
return 59.05;
}

if(foodName == ("Classic Corn Cup"){

return 90.48 ;
}
 
 if(foodName == "Mustard Sauce"){
return 19.05 ;
}  	


if(foodName == "Barbeque Sauce"){
return 19.07;
}

else {
System.out.println(foodName + "not found");
}

return foodprice;

}
}
