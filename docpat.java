class Doctor{
Doctor(long Phone, String address){
System.out.println("Doctor Phone no is "+Phone);
System.out.println("Doctor address is "+address);
}
}
class Patient extends Doctor{
Patient(String name, int age ){
super(5803997878l,"California");
System.out.println("Patient address is "+name);
System.out.println("Patient age is "+age);

}
}
class SuperDemo{
public static void main(String args[]){
Patient a= new Patient("Ram",22);
}
} 