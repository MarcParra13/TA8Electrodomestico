class Electrodomestico {
	//Atributos heredables clase Electrodomestico
	double precioBase;
	final static double precioBaseDefecto = 100;
	String color;
	final static String colorDefecto = "Blanco";
	char consumoEnergetico;
	final static char consumoEnergeticoDef = 'F';
	double peso = 5;
	final static double pesoDefecto = 5;
	
	//Constructor por defecto
	Electrodomestico() {
		this.precioBase = precioBaseDefecto;
		this.color = comprobarColor(colorDefecto);
		this.consumoEnergetico = comprobarConsumo(consumoEnergeticoDef);
		this.peso = pesoDefecto;
	}
	
	//Constructor con el precio base y el peso
	Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	//Constructor con todos los atributos
	Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumo(consumoEnergetico);
		this.peso = peso;
	}
	
	//Método para comprobar si el color es correcto. En caso de error: Color inválido
	public String comprobarColor(String color) {
		
		if(color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Rojo")
				|| color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris")) {
			this.color = color;
		} else {
			this.color = "Color inválido";
		}
		
		return this.color;
	}
	
	//Método para comprobar si el consumo energético es correcto. En caso de error: Z
	public char comprobarConsumo(char consumoEnergetico) {
		
		if(consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C' || consumoEnergetico == 'D'
				 || consumoEnergetico == 'E' || consumoEnergetico == 'F') {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = 'Z';
		}
		
		return this.consumoEnergetico;
		
	}
	
	//Sobreescribimos el método toString
	@Override
	public String toString() {
		return "Precio Base: " + precioBase +
				"\nColor: " + color +
				"\nConsumo Energético: " + consumoEnergetico +
				"\nPeso: " + peso;
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		//Creamos un objeto con constructor por defecto
		Electrodomestico electro1 = new Electrodomestico();
		System.out.println("Electrodoméstico 1");
		System.out.println("----------------------------------");
		System.out.println(electro1);
		
		System.out.println();
		
		//Creamos un objeto con constructor con todos los atributos
		Electrodomestico electro2 = new Electrodomestico(199.99, "Amarillo", 'H', 10);
		System.out.println("Electrodoméstico 2");
		System.out.println("----------------------------------");
		System.out.println(electro2);

	}

}
