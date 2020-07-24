import java.util.Scanner;
class Student{
	int id;
	float percentage;
	static String clg;
	static int clg_pincode;
}
class ramDetail{
public static void main(String args[]){
	Student ram= new Student();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Student detail:");
	ram.id=sc.nextInt();
	ram.percentage=sc.nextFloat();
	Student.clg=sc.next();
	Student.clg_pincode=sc.nextInt();
	System.out.println("=============Student detail=========");
	System.out.println("id="+ram.id);
	System.out.println("Percentage="+ram.percentage);
	System.out.println("collage="+ram.clg);
	System.out.println("Collage Pincode="+ram.clg_pincode);
}
}
	