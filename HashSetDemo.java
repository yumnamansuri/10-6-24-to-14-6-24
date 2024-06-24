package Code14_6;
import java.util.Collections;
import java.util.HashSet;


public class HashSetDemo {

	
		
		static void addElement(HashSet<Integer> numberHashSet)
		{
			numberHashSet.add(61);
			numberHashSet.add(20);
			numberHashSet.add(52);
			numberHashSet.add(5);
			numberHashSet.add(100);
			numberHashSet.add(30);
			numberHashSet.add(80);
			
			System.out.println(numberHashSet.add(20));
		}
		
		public static void main(String[] args) {

			
			HashSet<Integer> numberHashSet = new HashSet<>();
			addElement(numberHashSet);
			
			HashSet<Integer> numberHashSet1 = new HashSet<>();
			numberHashSet1.add(20);
			numberHashSet1.add(10);
			numberHashSet1.add(45);
			numberHashSet1.add(38);
			numberHashSet1.add(18);
			numberHashSet1.add(61);
			numberHashSet1.add(70);
			
			System.out.println("Set 1 => "+numberHashSet);
			System.out.println("Set 2 => "+numberHashSet1);
			
			HashSet<Integer> numberHashSet2 = new HashSet<>();
			addElement(numberHashSet2);
			
			
			//Union(add) of 2 sets
			
			numberHashSet2.addAll(numberHashSet1);
			System.out.println("Result Set => "+numberHashSet2);
			
			numberHashSet2.clear();
			addElement(numberHashSet2);
			
			numberHashSet2.removeAll(numberHashSet1);
			System.out.println(numberHashSet2);
			
	}

}
