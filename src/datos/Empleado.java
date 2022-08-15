package datos;

public class Empleado extends Persona{
	private int NumEmpleado;
	private int FechaIngreso;
	private String Puesto;

	
	public Empleado(String nombre, int birthdate, int edad, String genero, int numEmpleado, int fechaIngreso,
			String puesto) {
		super(nombre, birthdate, edad, genero);
		NumEmpleado = numEmpleado;
		FechaIngreso = fechaIngreso;
		Puesto = puesto;
	}


	public Empleado() {
		super();

	}

	
	public int getNumEmpleado() {
		return NumEmpleado;
	}
	public void setNumEmpleado(int numEmpleado) {
		NumEmpleado = numEmpleado;
	}
	public int getFechaIngreso() {
		return FechaIngreso;
	}
	public void setFechaIngreso(int fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}
	public String getPuesto() {
		return Puesto;
	}
	public void setPuesto(String puesto) {
		Puesto = puesto;
	}


	@Override
	public String toString() {
		return "---------------------------------------------\n"
			+ super.toString()+"\n"
	        + "Numero de Empleado= " + getNumEmpleado() + "\n"
			+ "Fecha de Ingreso= " + getFechaIngreso() +"\n"
			+ "Puesto= " + getPuesto() + "\n"
			+"-------------------------------------------------";
	}


	
	
	
	
	
}
