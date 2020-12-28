package firstPac;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HW07_1Collections {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
	        set1.add(rnd.nextInt(20));}
		
		for (int i = 0; i < 10; i++) {
	        set2.add(rnd.nextInt(20));}
		
        System.out.println("SET1 ["+set1.size() + "]" + " = " + set1);
        System.out.println("SET2 ["+set2.size() + "]" + " = " + set2);
		
		Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("UNION ["+union.size() + "]" + " = " + union);
        
        Set<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        System.out.println("INTERSECTION ["+intersect.size() + "]" + " = " + intersect);

	}
}
