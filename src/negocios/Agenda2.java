package negocios;

import java.util.LinkedList;

import datos.Miembro;
import ui.Interfaz;

public class Agenda2 {
	public static void main(String[] args)  {
		Interfaz i2= new Interfaz();
		i2.lectura();
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
		return "------------------------\n"
				+ "Lista de Miembros\n"
				+ getLista2() + "\n";
	}
}
