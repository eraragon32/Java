import java.util.Scanner;
class Student{
	int id;
	float percentage;
	static String clg;
	static int clg_pincode;
}
class varabledemo{
public static void main(String args[]){
	Student rahul= new Student();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Student detail:");
	rahul.id=sc.nextInt();
	rahul.percentage=sc.nextFloat();
	Student.clg=sc.next();
	Student.clg_pincode=sc.nextInt();
	System.out.println("=============Student detail=========");
	System.out.println("id="+rahul.id);
	System.out.println("Percentage="+rahul.percentage);
	System.out.println("collage="+rahul.clg);
	System.out.println("Collage Pincode="+rahul.clg_pincode);
}
}
	