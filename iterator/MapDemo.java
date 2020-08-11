import java.util.*;
class MapDemo{
public static void main(String args[]){
TreeMap<Integer,String> hm=new TreeMap<Integer, String>();
hm.put(1000,"Amar");
hm.put(1001,"Ball");
hm.put(1002,"Cat");
hm.put(1003,"Dog");
hm.put(1004,"Elephant");
hm.put(1005,"Fish");
hm.put(1006,"Gustak");
hm.put(1007,"Henery");
System.out.println(hm);
Set<Map.Entry<Integer,String>> st=hm.entrySet();
Iterator i=st.iterator();
while(i.hasNext()){
	Map.Entry mp=(Map.Entry)i.next();
	System.out.println(mp.getKey());
	System.out.println(mp.getValue());
}








//OR we can do this -------------
//Set<Integer> s=hm.keySet();
//Iterator x=s.iterator();
//while(x.hasNext()){
	//System.out.println(x.next());
//}
//Collection c=hm.values();
//Iterator i=c.iterator();
//while(i.hasNext()){
//	System.out.println(i.next());
//}
}
}