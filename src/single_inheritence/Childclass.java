package single_inheritence;

public class Childclass extends Parent {

	public void bike() {
		System.out.println("Bike : Appachi 160 4v BS6");

	}
	
	public static void main(String[] args) {
		
		Childclass c = new Childclass();
		c.work();
		c.bike();
	}
}
