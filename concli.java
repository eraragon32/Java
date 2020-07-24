import java.util.*;
class Contractor{
Contractor(String name,long Phone, String address){
System.out.println("Contractor name is "+name);
System.out.println("Contractor Phone no is "+Phone);
System.out.println("Contractor address is "+address);
}
}
class client extends Contractor{
client(String name, String address,long Phone, long budget){
super("Vijay",5803997878l,"California");
System.out.println("client address is "+name);
System.out.println("client address is "+address);
System.out.println("client Phone no is "+Phone);
System.out.println("client budget for building Garage is="+budget);

// Create a currency for INR
      Currency cur1 = Currency.getInstance("INR");

      // Get and print the symbol of the currency
      String symbol = cur1.getSymbol();
      System.out.println("Currency symbol is = " + symbol); 
 
}
}
class SuperDemo{
public static void main(String args[]){
client a= new client("Ram","1256 14th south street,Texas",5809876789l,45634);
}
} 