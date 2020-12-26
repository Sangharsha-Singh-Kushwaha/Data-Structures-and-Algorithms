package Set;
import java.util.*;
public class HashSetEX {
public static void main(String[] args) {
		
		Set<Integer> hs=new HashSet<>();
		
		Set<Integer> hs1=new HashSet<>();
		
		hs.add(12);
		hs.add(34);
		hs.add(58);
		hs.add(92);
		
		hs1.add(102);
		hs1.add(34);
		hs1.add(58);
		hs1.add(2);
		
		
		System.out.println(hs);
		System.out.println();
		System.out.println(hs1);
		System.out.println();
		
		hs.addAll(hs1);
		System.out.println("Union of the two sets is "+hs);
		System.out.println();
		hs.remove(2);
		hs.remove(102);
		hs.retainAll(hs1);
		System.out.println("Intersection of two sets is "+hs);
		hs.add(12);
		hs.add(92);
		System.out.println();
		System.out.println("set two is subset of one = "+hs.containsAll(hs1));
		System.out.println();
	}


}
