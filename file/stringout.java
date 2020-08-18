import java.io.*;
class stringoutput{
	public static void main(String args[])throws Exception{
	FileOutputStream fo=new FileOutputStream("C:\\Users\\solar\\OneDrive\\Documents\\GitHub\\Java\\file\\ioutput.txt");
	String s="Welcome Home";
	byte[] x=s.getBytes();
	fo.write(x);
	fo.close();
}
}