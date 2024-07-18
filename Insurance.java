class Insurance {

public static double search(String insurancename){

if (insuranceName == "Hdfc life insurance"){
return 7000.80;
}
  
if(insuranceName == "Birla Sunlife Insurance"){
return 7200.18;
}

if(insuranceName == "Bharti AXA Life Insurance"){
return 6300.27;
}

if(insuranceName == "Bajaj Allianz Life Insurance"){
return 5400.98;
}

if(insuranceName == "Shriram General Insurance"){
  return 2700.87;
 }
  
if (insuranceName == "Max Life"){
return 6578.98;
}

if(insuranceName == "Reliance General Insurance"){
return 3240.90;
}
 
 if(insuranceName == "Kotak Life Insurance"){
return 2610.90;
}  	


if(insuranceName == "TATA AIG"){
return 7569.94;
}

else {
System.out.println(insuranceName + "not found");
}

return insuranceprice;

}
}
