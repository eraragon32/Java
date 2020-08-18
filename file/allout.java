import java.io.*;
class bufferedoutput{
public static void main(String args[])throws Exception{
FileOutputStream fo=new FileOutputStream("C:\\Users\\solar\\OneDrive\\Documents\\GitHub\\Java\\file\\ioutput.txt");
BufferedOutputStream bo=new BufferedOutputStream(fo);

String s="I wanna visit Uthopia";
byte[] x=s.getBytes();
bo.write(x);
bo.flush();
bo.close();
fo.close();
}
} 