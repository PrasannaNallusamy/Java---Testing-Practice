
public class array {

	public static void main(String[] args) {

		int num[] = new int[5];

		String s[] = new String[6];

		s[0] = "Prasanna";
		s[1] = "Chandru";
		s[2] = "Sai";

		System.out.println(s.length);

		System.out.println(s[1]);

		System.out.println(s[5]);

		System.out.println("************* For Looping************************");

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		System.out.println("************* Foreach Looping************************");

		for (String x : s) {

			System.out.println(x);

		}
	}
}
