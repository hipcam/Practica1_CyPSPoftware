package com.tecsup.lab03.leon;

public class RopaCaballero {

	//branch leon
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
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
	
	public RopaCaballero(String nombre, String descripcion, int talla, String foto_uri, double precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.talla = talla;
		this.foto_uri = foto_uri;
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "RopaCaballero [nombre=" + nombre + ", descripcion=" + descripcion + ", talla=" + talla + ", foto_uri="
				+ foto_uri + ", precio=" + precio + "]";
	}
	private String nombre;
	private String descripcion;
	private int talla;
	private String foto_uri;
	private double precio;
	
	
	
}
}


/*
La asociación de ropa de caballeros desea publicar 
los nombres de la prenda, 
su descripción, 
talla, 
 fotos y
  precios de sus productos

*/