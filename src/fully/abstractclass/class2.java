package fully.abstractclass;

public class class2 implements class1 {

	@Override
	public void name() {
		System.out.println("Prasanna N");

	}

	@Override
	public void work() {
		System.out.println("Software Engineering");

	}

	@Override
	public void bike() {
		System.out.println("Appachi 160 4V");

	}

	@Override
	public void adrress() {
		System.out.println("Westarty Co living PG");

	}

	public static void main(String[] args) {

		class2 c = new class2();

		c.name();
		c.work();
		c.bike();
		c.adrress();

	}
}
