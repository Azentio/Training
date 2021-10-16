package assignment;

import java.util.*;  
public class arrayiterator{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();
  list.add("Apple");    
  list.add("Banana");    
  list.add("Grapes");    
  //Traversing list through Iterator  
  Iterator<String> itr=list.iterator();
  while(itr.hasNext()){//check if iterator has the elements  
   System.out.println(itr.next());//printing the element and move to next  
  }  
 }  
}  

