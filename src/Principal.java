import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		Cerveza c = null;
		ImplementacionCerveza imp = new ImplementacionCerveza();
		do {
			System.out.println("Menú");
			System.out.println("1.- Alta");
			System.out.println("2.- Editar por llave");
			System.out.println("3.- Eliminar por Llave");
			System.out.println("4.- Eliminar por Tipo");
			System.out.println("5.- Eliminar todo");
			System.out.println("6.- Buscar por llave");
			System.out.println("7.- Buscar por tipo");
			System.out.println("8.- Contar");
			System.out.println("9.- Vacia");
			System.out.println("10.- Mostrar");
			System.out.println("11.- Salir");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1: {
				c=null;
				System.out.println("Ingrese nombre de la cerveza");
				String nombre = entrada.next();
				System.out.println("Ingrese marca");
				String marca = entrada.next();
				System.out.println("Ingrese Tipo");
				String tipo = entrada.next();
				System.out.println("Ingrese precio");
				double precio = entrada.nextDouble();
				System.out.println("Ingrese porcentaje de alcohol");
				int porcentaje = entrada.nextInt();

				c = new Cerveza(nombre,marca,tipo,precio,porcentaje);
				imp.guardar(c);
								
				}
				break;
			case 2: {
				//c=null;
				System.out.println("que gustaria editar");
				System.out.println("1.- Nombre");
				System.out.println("2.- Tipo");
				System.out.println("3.- Precio");
				int opcion2 = entrada.nextInt();
				if (opcion2==1) {
					System.out.println("Ingrese nombre de cerveza a editar");
					String nombre = entrada.next();
					c= new Cerveza();
					c.setNombre(nombre);
					Cerveza cervezaEditar = (Cerveza) imp.buscarLlave(c);
					System.out.println("Ingrese nombre");
					String nombreEditado = entrada.next();
					cervezaEditar.setNombre(nombreEditado);
					imp.editar(cervezaEditar);
					System.out.println("Cerveza Editada");
				}
				if (opcion2==2) {
					System.out.println("Ingrese nombre de cerveza a editar");
					String nombre = entrada.next();
					c= new Cerveza();
					c.setNombre(nombre);
					Cerveza cervezaEditar = (Cerveza) imp.buscarLlave(c);
					
					System.out.println("Ingrese Tipo");
					String nombreEditado = entrada.next();
					cervezaEditar.setTipo(nombreEditado);
					imp.editar(cervezaEditar);
					System.out.println("Cerveza Editada");
				}
				if (opcion2==3) {
					System.out.println("Ingrese nombre de cerveza a editar");
					String nombre = entrada.next();
					c= new Cerveza();
					c.setNombre(nombre);
					Cerveza cervezaEditar = (Cerveza) imp.buscarLlave(c);
					
					System.out.println("Ingrese Tipo");
					double nombreEditado = entrada.nextDouble();
					cervezaEditar.setPrecio(nombreEditado);
					imp.editar(cervezaEditar);
					System.out.println("Cerveza Editada");
				}
				c= null;
			}
				break;
			case 3: {
				c=null;
				System.out.println("Ingrese nombre de cerveza a eliminar");
				String nombre = entrada.next();
				c= new Cerveza();
				c.setNombre(nombre);
				Cerveza cervezaEliminar =(Cerveza) imp.buscarLlave(c);
				imp.eliminarLave(cervezaEliminar);

			}
				break;
			case 4: {
				//c=null;
				System.out.println("Ingrese tipo de cerveza a eliminar");
				String tipo = entrada.next();
				//c= new Cerveza();
				c.setTipo(tipo);
				imp.eliminarTipo(c);
			}
				break;
			case 5:{
				System.out.println("eliminar todo");
				imp.eliminarTodo();
			}
			break;
			case 6: {
				c=null;
				System.out.println("Ingrese nombre de cerveza a buscar");
				String nombre = entrada.next();
				c= new Cerveza();
				c.setNombre(nombre);
				Cerveza cervezaEditar = (Cerveza) imp.buscarLlave(c);
				System.out.println(cervezaEditar);
			}
				break;
			case 7: {
				c=null;
				System.out.println("Ingrese tipo de cerveza a buscar");
				String tipo = entrada.next();
				c= new Cerveza();
				c.setTipo(tipo);
				imp.buscarTipo(c);
				
			}
			break;
			case 8:{
				System.out.println("Cantidad de registros guardados ");
				imp.contar();
			}
				break;
			case 9:{
				imp.vacia();
			}
			break;
			case 10:{
				System.out.println("Mostrando todo");
				imp.mostrar();
			}
			break;
			case 11:{}
			break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}

		} while (opcion != 11);
	}

}
