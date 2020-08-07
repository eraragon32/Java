import java.util.*;
class setdemo{
	public static void main(String args[]){
		TreeSet<String> hs=new TreeSet<String>();
	//	System.out.println(hs.first());
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
		hs.add("Y");
		hs.add("L");
		hs.add("X");
		System.out.println(hs);
		System.out.println(hs.subSet("F",true,"T",true));
		System.out.println(hs.tailSet("K"));
	}
}