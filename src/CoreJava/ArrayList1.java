package CoreJava;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayList1 {
	 static int j;

	public static void main(String[] args) {
		
		
		  ArrayList<String> a= new ArrayList<String>(); 
		  a.add("first");
		  a.add("Second");
		  a.add("third");
		  a.add(0,"fourth"); 
		  System.out.println(a);
		  a.remove("fourth");
		  System.out.println(a);
		  System.out.println(a.get(2));
		 
	
		/*
		 * HashSet<String> hs = new HashSet<String>(); hs.add("Second");
		 * hs.add("third"); hs.add("fourth"); hs.add("fifth"); Iterator<String>
		 * i=hs.iterator();
		 * 
		 * while(i.hasNext()==true) { System.out.println(i.next()); }
		 */
	}

}
