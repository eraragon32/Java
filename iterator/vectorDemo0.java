import java.util.*;
class vectorDemo{
public static void main(String args[]){
Vector<String> hm=new Vector<String>();
hm.add("Amar");
hm.add("Ball");
hm.add("Cat");
hm.add("Dog");
hm.add("Elephant");
hm.add("Fish");
hm.add("Gustak");
hm.add("Henery");
System.out.println(hm);
    
 Iterator value = hm.iterator(); 
 while (value.hasNext()) { 
 System.out.println(value.next()); 
 } 
}
} 