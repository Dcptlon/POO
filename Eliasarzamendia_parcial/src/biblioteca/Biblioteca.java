package biblioteca;

public class Biblioteca {
	String nombre, horario;
	int numero_prestamos = 0;
	Material[] material = new Material[10];
	Persona[] persona = new Persona[10];
	Prestamo[] prestamo = new Prestamo[10];
	
	public Biblioteca() {
		nombre = "superBiblio";
		horario = "lunes a viernes de 8 a 15";
		material[0] = new Libro(123,"julio Vernne", "viaje al interior de la tierra", 1970, "disponible", "96325");
		persona[0] = new Alumno(426,"Elias arzamendia", "0961", "elisaarzamendia015@gmail.com", 1000);
		
		prestarMaterial(material[0], persona[0]);
		verMaterialesPrestados();
		
		
	}
	
	private void prestarMaterial(Material m, Persona p) {
		prestamo[numero_prestamos] = new Prestamo(m,p,"24/05/25","");
		numero_prestamos++;
	}
	
	private void verMaterialesPrestados() {
		System.out.println(prestamo[0].toString());
	}
	
	public static void main(String[] args) {
		new Biblioteca();
	}

}
