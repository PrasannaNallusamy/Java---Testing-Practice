package collection;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add("Prasann");
		l.add(10);
		l.add(20);
		l.add(0);
		l.add(10);

		System.out.println(l);

		System.out.println(l.size());

		System.out.println("=======================================================");

		List<Integer> l2 = new ArrayList<Integer>();

		l2.add(58);
		l2.add(48);
		l2.add(38);
		l2.add(28);

//		System.out.println(l2);
//
//		System.out.println(l2.get(2));
//		
//		System.out.println(l2.remove(2));
//		
//		System.out.println(l2);

		for (int i = 0; i < l2.size(); i++) {

			System.out.println(l2.get(i));

		}

		System.out.println("=======================================================");

		for (Integer integer : l2) {

			System.out.println(integer);

		}

		System.out.println(l.addAll(l2));
	}
}
