package es.studium.perro;

public class TestPerro {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro("Pastor Alem�n", 1.0, 8, "Marr�n");
		
		System.out.println("La raza del perro es: " + perro1.getRaza() + 
				"\nSu tama�o es: " + perro1.getTamanio() + 
				"m \nLa edad es: " + perro1.getEdad() + 
				" a�os \ny su color: " + perro1.getColor());
		
		perro1.setRaza("D�lmata");
		perro1.setTamanio(1);
		perro1.setEdad(2);
		perro1.setColor("Blanco y negro");
		//String dalmata = "Blanco y negro";
		
		System.out.println("---------------------------------------");
		System.out.println("Hemos modificado los atributos del perro creado \ny los imprimimos por pantalla:");
		System.out.println("---------------------------------------");
		System.out.println("La raza del perro es: " + perro1.getRaza() + 
				"\nSu tama�o es: " + perro1.getTamanio() + 
				"m \nLa edad es: " + perro1.getEdad() + 
				" a�os \ny su color: " + perro1.getColor());
		
	}

}
