class Parent{
Parent(int age){
System.out.println("Parent age is"+age);
}
}
class Child extends Parent{
Child(int age){
super(54);
System.out.println("Child age is "+age);
}
}
class SuperDemo{
public static void main(String args[]){
Child a= new Child(22);
}
} 