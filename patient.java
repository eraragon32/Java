class pedicure{
void menu(){
System.out.println("Nail , massage, wash");
}
void selected(String selected){
System.out.println("Selected service is "+selected);
}
String servicegiven(){
return "Nail";
}
String payBill(int amount){
System.out.println("Bill amount is "+amount);
return "Bill Paid";
}
}

class Customer{
public static void main(String args[]){
pedicure venki= new pedicure();
venki.menu();
venki.selected("Nail");
String paper=venki.servicegiven();
System.out.println("Food served is "+paper);
String finalBill=venki.payBill(939);
System.out.println("Final status: "+finalBill);
}
}