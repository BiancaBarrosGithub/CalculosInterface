package InterfaceCalculos;

public class Principal {

	public static void main(String[] args) {
		Calculando calculando = new Calculando();
		
		System.out.println(calculando.somar(10, 10));
		System.out.println(calculando.sub(20, 5));
		System.out.println(calculando.mult(5, 7));
		System.out.println(calculando.div(50, 2));
		System.out.println(calculando.exp(3, 5));
		

	}

}
