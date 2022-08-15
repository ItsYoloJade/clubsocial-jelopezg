package negocios;
import java.util.LinkedList;

import datos.Empleado;
import ui.Interfaz;

public class Agenda {
public static void main(String[] args)  {
		
		Interfaz i1= new Interfaz();
		i1.lectura();
	}
	
	LinkedList<Empleado> lista = new LinkedList <Empleado>();

	public boolean add(Empleado empleado) {
		char[] letras= empleado.getNombre().toCharArray();
		 int Birthdate= empleado.getBirthdate();
		 int edad = empleado.getEdad();
		 String genero = empleado.getGenero();
		 int NumEmpleado = empleado.getNumEmpleado();
		 int FechaIngreso = empleado.getFechaIngreso();
		 String Puesto = empleado.getPuesto();
		 
		lista.add(empleado);
		return true;
		
	}

	public LinkedList<Empleado> getLista() {
		return lista;
	}

	public void setLista(LinkedList<Empleado> lista) {
		this.lista = lista;
	}

	
	
	@Override
	public String toString() {
		return 
				"----------------------\n"
				+ "Lista de Empleados\n" 
				+ getLista() + "\n"	;
	}


	

}
