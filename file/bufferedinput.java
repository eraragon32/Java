import java.io.*;
class bufferedInput{
public static void main(String args[])throws Exception{
FileInputStream fz=new FileInputStream("C:\\Users\\solar\\OneDrive\\Documents\\GitHub\\Java\\file\\ioutput.txt");
BufferedInputStream bi=new BufferedInputStream(fz);

int x=bi.read();
while(x!=-1){
System.out.print((char)x);
x=bi.read();
}
bi.close();
fz.close();
}
} 