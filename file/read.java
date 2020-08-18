import java.io.*;
class input{
public static void main(String args[])throws Exception{
FileInputStream fi=new FileInputStream("C:\\Users\\solar\\OneDrive\\Documents\\GitHub\\Java\\file\\ioutput.txt");
int x=fi.read();
System.out.println(x);
System.out.println((char)x);

}
} 