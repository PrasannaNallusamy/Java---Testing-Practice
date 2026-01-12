package lopping.condition;

public class For {

	static int a = 10;

	public static void main(String[] args) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.println(j);
			}
			System.out.println("Iteration ====================== " + i);
		}
	}
}
