package datos;

public class Miembro extends Persona  {
	private int NumMembresia;
	private int EmisionMembresia;
	private int VenciMembresia;
	

	public Miembro(String nombre, int birthdate, int edad, String genero, int numMembresia, int emisionMembresia,
			int venciMembresia) {
		super(nombre, birthdate, edad, genero);
		NumMembresia = numMembresia;
		EmisionMembresia = emisionMembresia;
		VenciMembresia = venciMembresia;
	}

	public Miembro() {
		super();
	}

	public int getNumMembresia() {
		return NumMembresia;
	}
	public void setNumMembresia(int numMembresia) {
		NumMembresia = numMembresia;
	}
	public int getEmisionMembresia() {
		return EmisionMembresia;
	}
	public void setEmisionMembresia(int emisionMembresia) {
		EmisionMembresia = emisionMembresia;
	}
	public int getVenciMembresia() {
		return VenciMembresia;
	}
	public void setVenciMembresia(int venciMembresia) {
		VenciMembresia = venciMembresia;
	}

	@Override
	public String toString() {
		return "Miembro [NumMembresia=" + NumMembresia + ", EmisionMembresia=" + EmisionMembresia + ", VenciMembresia="
				+ VenciMembresia + "]";
	}
	
	
	
	
}
