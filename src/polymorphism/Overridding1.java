package polymorphism;

public class Overridding1 extends Overridding2 {
	private void sample() {
		System.out.println("Prasanna Nallusamy");
	}

public static void main(String[] args) {
	Overridding1 o = new Overridding1();
	o.sample();
}
}
