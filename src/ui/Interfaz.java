package ui;

import java.util.Scanner;

import datos.Empleado;
import datos.Miembro;
import negocios.Agenda;
public class Interfaz {

	static Scanner entrada= new Scanner (System.in);
	static  Agenda lista = new Agenda();
		
		public static void lectura() {
			System.out.println("Bienvenido");
			
			imprimirMenu();
		}
	       private static void validarEmpleado()  {
	    	   
	    	   Empleado empleado = new Empleado();
		   System.out.println("Ingresar nombre");
		   empleado.setNombre(entrada.next());
	       System.out.println("Ingresar fecha de nacimiento");
	        empleado.setBirthdate(entrada.nextInt());
	       System.out.println("Ingresar edad");
	       empleado.setEdad(entrada.nextInt());
	       System.out.println("Ingresar genero");
	       empleado.setGenero(entrada.next());
	       System.out.println("Ingresar numero de empleado");
	       empleado.setNumEmpleado(entrada.nextInt());
	       System.out.println("Ingresar fecha de ingreso");
	       empleado.setFechaIngreso(entrada.nextInt());
	       System.out.println("Ingresar puesto");
	       empleado.setPuesto(entrada.nextLine());
	       
	       if(lista.add(empleado)== true) {
	    	   System.out.println("El empleado a sido registrado exitosamente");
	       } else {
	    	   System.out.println("Error en el ingreso de los datos");
	       }
	       imprimirMenu();
	}
	       
	    private static void mostrarEmpleado() {
	    	System.out.println(lista);
	    	imprimirMenu();
	    }   
	    
	    private static void validarMiembro()  {
	    	Miembro miembro = new Miembro ();
	    	System.out.println("Ingresar nombre");
	 	   miembro.setNombre(entrada.next());
	        System.out.println("Ingresar fecha de nacimiento");
	         miembro.setBirthdate(entrada.nextInt());
	        System.out.println("Ingresar edad");
	        miembro.setEdad(entrada.nextInt());
	        System.out.println("Ingresar genero");
	        miembro.setGenero(entrada.next());
	        System.out.println("Ingresar numero de membresia");
	        miembro.setNumMembresia(entrada.nextInt());
	        System.out.println("Ingresar fecha de emision de la membresia");
	        miembro.setEmisionMembresia(entrada.nextInt());
	        System.out.println("La fecha de vencimiento de la membresia"
	        		+ "es de 2 años exactos a partir de la fecha de emision");
	        
	        if(lista.add(miembro)== true) {
	     	   System.out.println("El miembro a sido registrado exitosamente");
	        } else {
	     	   System.out.println("Error en el ingreso de los datos");
	        }
	        imprimirMenu(); 
	    }
	    
	    private static void mostrarMiembro() {
	    	System.out.println(lista);
	    	imprimirMenu();
	    }   
	     
	    private static void salir() {
	    	System.out.println("El programa ha finalizado");
	    	System.exit(0);
	    }

		private static void imprimirMenu() {
			System.out.println("------------------MENU-----------------");
			System.out.println("1. Empleados");
			System.out.println("2. Miembros");
			System.out.println("3. Salir");
			System.out.println("---------------------------------------");
			int opcion= entrada.nextInt(); 
			
			switch (opcion) {
			case 1: {
				System.out.println("1. Agregar empleado");
				System.out.println("2. Mostrar lista de empleados");
				System.out.println("3. volver");
				int opcion2= entrada.nextInt();
				
				if(opcion2 == 1) {
					validarEmpleado();
				} else 
					if(opcion2== 2) {
						mostrarEmpleado();
					} else 
						if(opcion2 == 3) {
							imprimirMenu();
						}
				
				break;
			}
				case 2: {
					System.out.println("1. Agregar miembro");
					System.out.println("2. Mostrar lista de miembros");
					System.out.println("3. volver");
					int opcion3= entrada.nextInt();
					
					if(opcion3 == 1) {
						validarMiembro();
					} else 
						if(opcion3== 2) {
							mostrarMiembro();
						} else 
							if(opcion3 == 3) {
								imprimirMenu();
							}
					break;
				}
				
				case 3: salir();
				    break;
			
			default: System.out.println("Ha ingresado una opcion invalida");
			imprimirMenu();
				break;
			}
		}
		
		

}
