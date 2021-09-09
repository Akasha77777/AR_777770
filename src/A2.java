import java.util.HashSet;
import java.util.TreeSet;

public class A2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[])
	{
		//@SuppressWarnings("rawtypes")
		//Just remove the duplicate we go for set
		//1.remove the duplicate element in the list 
		//Ans>Go for list
		//2.Tree set for sorted order
		
		//if i want to remove the duplicate + maintain insertion order then go
		//for linked hash set
		
		
		//
		
		HashSet<Comparable> set=new HashSet<Comparable>();
		set.add(30);
		set.add(20);
		set.add(null);//null value one
		set.add(30);
		set.add(null);
		set.add("akasha");
		
		TreeSet treeset=new TreeSet();
		treeset.add(30);
		treeset.add(20);
		treeset.add(10);
		
		
	}
}
