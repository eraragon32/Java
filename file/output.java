import java.io.*;
class output{
	public static void main(String args[])throws Exception{
	FileOutputStream fo=new FileOutputStream("C:\\Users\\solar\\OneDrive\\Documents\\GitHub\\Java\\file\\ioutput.txt");
	fo.write(65);
	fo.close();
}
}