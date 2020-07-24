import java.util.Scanner;
class Student{
	int id;
	float percentage;
	static String clg;
	static int clg_pincode;
}
class bhargav{
public static void main(String args[]){
	Student bhargav= new Student();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Student detail:");
	bhargav.id=sc.nextInt();
	bhargav.percentage=sc.nextFloat();
	Student.clg=sc.next();
	Student.clg_pincode=sc.nextInt();
	System.out.println("=============Student detail=========");
	System.out.println("Collage id of bhargav is="+bhargav.id);
	System.out.println("Collage Percentage="+bhargav.percentage);
	System.out.println("Name of Collage="+bhargav.clg);
	System.out.println("Collage Pincode="+bhargav.clg_pincode);
}
}
	