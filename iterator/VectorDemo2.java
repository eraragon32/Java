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
Enumeration<String> a=hm.elements();
Iterator x=a.iterator();
while(x.hasNext()){
	System.out.println(x.next());
}


///////////Spliterator<E> spliterator();




//Set<Map.Entry<Integer,String>> st=hm.entrySet();
//Iterator i=st.iterator();
//while(i.hasNext()){
//	Map.Entry mp=(Map.Entry)i.next();
//	System.out.println(mp.getKey());
//	System.out.println(mp.getValue());
//}
//-------------------------------------------------
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