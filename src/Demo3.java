import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Demo3{
		  
		  public static void main(String[] args)
		  {
			  
		/*
		 * Vector v =new Vector();
		 * 
		 * for(int i=0;i<=10;i++) { v.addElement(i); } System.out.println(v);
		 * Enumeration e=v.elements();
		 * 
		 * while(e.hasMoreElements()) { Integer g=(Integer)e.nextElement(); if(g%2==0) {
		 * System.out.println(g); } } System.out.println(v);
		 */
			  
			  
			  ArrayList a=new ArrayList();
			  
			  for (int i=0;i<=10;i++)
			  {
				  a.add(i);
			  }
			  System.out.println(a);
			  Iterator itr = a.iterator();
			  
			  while(itr.hasNext())
			  {
				  Integer in = (Integer)itr.next();
				  if(in%2==0)
				  {
					  System.out.println(in);
				  }
				  else
					  itr.remove();
			  }
			  System.out.println(a);
		  }
}