public class Arreglalo2 {
	
	public Persona persona;

	public static void main(String[] args) {
		
		Arreglalo2 arreglalo2 = new Arreglalo2();
		
		arreglalo2.persona = new Persona();
		
		Calculadora calculadora = arreglalo2.persona.getCalculadora();
		
		int resultadoSuma = calculadora.sumar(10, 5);
		
		System.out.println(resultadoSuma);

		 double resultadoDividir = calculadora.dividir(5.5f, 4.0f);

		System.out.println(resultadoDividir);
	}
}

class Persona {
	Calculadora calculadora;

	Persona() {
		this.calculadora = new Calculadora();
	}

	public Calculadora getCalculadora() {
		return this.calculadora;
	}
}

class Calculadora {

	public int sumar(int a, int b) {
		return a + b;
	}

	public double dividir(double numero1, double numero2) {
		return numero1 / numero2;
	}
}
