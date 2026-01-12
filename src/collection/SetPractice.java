package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		
		List<Integer> s1 = new ArrayList<Integer>();
		Set<Integer> s2 = new TreeSet<Integer>();
		
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(40);
		
		s2.addAll(s1);
		
	int dubicate = s1.size()-s2.size();
	
	System.out.println(dubicate);
	}
}
