package Coffe.Coffe;

public abstract class CafeDecorator extends Cafe {

	protected Cafe cafe;

	public CafeDecorator(Cafe cafe) {
		this.cafe = cafe;
	}

	public void preparar() {
		cafe.preparar();
	}

}
