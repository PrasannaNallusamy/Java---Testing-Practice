package polymorphism;

public class Overloading {

	private void sample() {
		System.out.println("Empty method");
	}

	private void sample(int a) {
		System.out.println(a);
	}

	private void sample(String s, char initial) {
		System.out.println("name : " + s + " " + initial);
	}

	public static void main(String[] args) {

		Overloading o = new Overloading();
		o.sample();
		o.sample(2138);
		o.sample("Prasanna",'N');
		
	}

}
