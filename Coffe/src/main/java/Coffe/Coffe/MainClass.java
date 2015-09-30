package Coffe.Coffe;

public class MainClass {
	public static void main(String[] args) {

		Cafe cafe1 = new Creme(new Preto());

		cafe1.preparar();
		
		System.out.println("");

		Cafe cafe2 = new Acucar(new Preto());

		cafe2.preparar();
		
		System.out.println("");

		Cafe cafe3 = new Acucar(new Creme(new Preto()));

		cafe3.preparar();
		
		System.out.println("");
		
		Cafe cafe4 = new Creme(new Creme(new Preto()));

		cafe4.preparar();

	}

}
