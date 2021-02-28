
public class Cerveza {
	private String nombre;
	private String marca;
	private String tipo;
	private double precio;
	private int porcentaje;
	
	public Cerveza() {
		
	}
	
	public Cerveza(String nombre, String marca, String tipo, double precio, int porcentaje) {
		this.nombre = nombre;
		this.marca = marca;
		this.tipo = tipo;
		this.precio = precio;
		this.porcentaje = porcentaje;
	}

	
	
	public Cerveza(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return "Cerveza [nombre=" + nombre + ", marca=" + marca + ", tipo=" + tipo + ", precio=" + precio
				+ ", porcentaje=" + porcentaje + "]";
	}
	
	 
	
	
}
