import java.io.*;
class input{
	public static void main(String args[])throws Exception{
FileReader fr=new FileReader("C:\\Users\\solar\\OneDrive\\Documents\\GitHub\\Java\\file\\example3.txt");
int i=fr.read();
while(i!=-1){
System.out.print((char)i);
i=fr.read();
}

fr.close();
}
}