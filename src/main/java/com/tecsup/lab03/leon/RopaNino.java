package com.tecsup.lab03.leon;

public class RopaNino {
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFoto_uri() {
		return foto_uri;
	}
	public void setFoto_uri(String foto_uri) {
		this.foto_uri = foto_uri;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "RopaNino [nombre=" + nombre + ", foto_uri=" + foto_uri + ", precio=" + precio + "]";
	}
	public RopaNino(String nombre, String foto_uri, double precio) {
		super();
		this.nombre = nombre;
		this.foto_uri = foto_uri;
		this.precio = precio;
	}
	
	
	private String nombre;
	private String foto_uri;
	private double precio;
}
