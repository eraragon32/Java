import java.util.*;
class first{
	public static void main(String args[]){
		TreeSet<String> hs=new TreeSet<String>();
	
		hs.add("F");
		hs.add("K");
		hs.add("E");
		hs.add("M");
		hs.add("W");
		hs.add("");
		hs.add("F");
		hs.add("O");
		hs.add("T");
		hs.add("C");
		hs.add("S");
		hs.add("J");
		hs.add("U");
		hs.add("Q");
		hs.add("L");
		hs.add("X");
		System.out.println(hs);
		System.out.println(hs.first());
		System.out.println(hs.last());
		System.out.println(hs.lower("R"));
		System.out.println(hs.floor("K"));
		System.out.println(hs.ceiling("T"));
		System.out.println(hs.higher("T"));
		System.out.println(hs.pollFirst());
		System.out.println(hs.pollLast());
	
	
	//	System.out.println(hs.subSet("F",true,"T",true));
	//	System.out.println(hs.tailSet("K"));
	}
}