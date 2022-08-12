package negocios;
import java.util.Collection;
import java.util.LinkedList;

import datos.Empleado;
import datos.Miembro;
import ui.Interfaz;

public class Agenda {
public static void main(String[] args)  {
		
		Interfaz i1 = new Interfaz();
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

	
	LinkedList<Miembro> lista2 = new LinkedList <Miembro>();

	public boolean add(Miembro miembro) {
		char[] letras= miembro.getNombre().toCharArray();
		 int Birthdate= miembro.getBirthdate();
		 int edad = miembro.getEdad();
		 String genero = miembro.getGenero();
		 int NumMembresia = miembro.getNumMembresia();
		 int EmisionMembresia = miembro.getEmisionMembresia();
		
		 lista2.add(miembro);
		return true;

}

	public LinkedList<Miembro> getLista2() {
		return lista2;
	}

	public void setLista2(LinkedList<Miembro> lista2) {
		this.lista2 = lista2;
	}

	@Override
	public String toString() {
		return "Lista de Empleados" + lista + "Lista de Miembros" + lista2; 
	}

}
