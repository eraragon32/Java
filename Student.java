class University{
void allClass(){
System.out.println("English, Math, Science, Geo");
}
void classSelected(String classSelected){
System.out.println("Class Selected are: "+classSelected );
}
String classes(){
return "Math";
}
String colzFee(int fee){
System.out.println("Total Fee paid is :"+fee);
return "Fee Paid";
}
}


class Student{
public static void main(String args[]){
University ram=new University();
ram.allClass();
ram.classSelected("Math");
String room=ram.classes();
System.out.println("Class Taken is:"+room);
String totalBill= ram.colzFee(5000);
System.out.println("Final status: "+totalBill);
}
}