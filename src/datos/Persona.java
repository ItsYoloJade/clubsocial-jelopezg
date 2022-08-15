package datos;

public class Persona {
	private String nombre;
	private int Birthdate;
	private int edad;
	private String genero;
	

	
	public Persona(String nombre, int birthdate, int edad, String genero) {
		super();
		this.nombre = nombre;
		Birthdate = birthdate;
		this.edad = edad;
		this.genero = genero;
	}
	
	public Persona() {
		super();
		
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(int birthdate) {
		Birthdate = birthdate;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Datos Generales\n"
			+ "Nombre= " + nombre + "\n"
			+ "Fecha de Nacimiento= " + Birthdate + "\n "
			+ "Edad= " + edad + "\n"
			+ "Genero= " + genero + "\n";
	}

	
}
