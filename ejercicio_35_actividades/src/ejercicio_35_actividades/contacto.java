package ejercicio_35_actividades;

public class contacto {
	
	private String nombre, direccion;
	private int telefono;
	private static int cantidad_elementos = 0;
	private static contacto[] lista = new contacto[99];

	public contacto() {
		nombre = null;
		telefono = 0;
		direccion = null;
		lista[cantidad_elementos] = this;
		cantidad_elementos++;
	}

	public contacto(String nombre, String direccion, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		lista[cantidad_elementos] = this;
		cantidad_elementos++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public static void Listado() {
		for (int i = 0; i < cantidad_elementos; i++) {
			System.out.println(i + " " + lista[i]);
		}
	}

	public static boolean Eliminar(int eliminar) {
		if (eliminar < cantidad_elementos) {
			for (int i = eliminar; i < cantidad_elementos; i++) {
				lista[i] = lista[i + 1];

			}
			cantidad_elementos--;
			return true;
		}
		return false;
	}

	public static boolean Modificacion(int mod, String nombre, String direccion, int telefono) {
		if (mod < cantidad_elementos) {
			lista[mod].setNombre(nombre);
			lista[mod].setDireccion(direccion);
			lista[mod].setTelefono(telefono);
			return true;
		}
		return false;
	}

	public static String menu() {
		return " 1. Añadir Contacto" + "\n 2. Modificar Contacto" + "\n 3. Eliminar Contacto"
				+ "\n 4. Listado de contactos" + "\n 5. Cerrar aplicacion";
	}

	public String toString() {
		return "El nombre es " + nombre + ", la direccion es " + direccion + " y el telefono " + telefono;
	}

}
