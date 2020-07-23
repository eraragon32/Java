class Resturant{
void menu(){
System.out.println("Idly, Dosa, Wada");
}
void order(String order){
System.out.println("Order Placed is "+ order);
}
String serveFood(){
return "Idly";
}
String payBill(int amount){
System.out.println("Bill amount is "+amount);
return "Bill Paid";
}
}

class Customer{
public static void main(String args[]){
Resturant ohris= new Resturant();
ohris.menu();
ohris.order("Idly");
String plate=ohris.serveFood();
System.out.println("Food served is "+plate);
String finalBill=ohris.payBill(99);
System.out.println("Final status: "+finalBill);
}
}