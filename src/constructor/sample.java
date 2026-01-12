package constructor;

public class sample {

	public sample() {
		this(1);

		System.out.println("Contructor test");

	}

	public sample(int rank) {
		this("Prasanna");
		System.out.println(rank);
	}

	public sample(String Name) {
		System.out.println(Name);
	}

	public static void main(String[] args) {

		sample s = new sample();
	}
}
