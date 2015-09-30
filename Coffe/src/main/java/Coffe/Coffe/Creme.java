package Coffe.Coffe;


public class Creme extends CafeDecorator {

	public Creme(Cafe cafe) {
		super(cafe);
		
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Creme");

	}

}
