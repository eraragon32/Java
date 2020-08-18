import java.io.*;
class stringinput{
public static void main(String args[])throws Exception{
FileInputStream fi=new FileInputStream("C:\\Users\\solar\\OneDrive\\Documents\\GitHub\\Java\\file\\ioutput.txt");
int x=fi.read();
while(x!=-1){
System.out.print((char)x);
x=fi.read();
}
fi.close();
}
} 