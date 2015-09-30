package Coffe.Coffe;


public class Acucar extends CafeDecorator {

	public Acucar(Cafe cafe) {
		super(cafe);
		
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("A�ucar");

	}

}
