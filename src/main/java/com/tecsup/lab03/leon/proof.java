package com.tecsup.lab03.leon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.tecsup.lab03.leon.RopaCaballero;
import com.tecsup.lab03.leon.RopaNino;
public class proof {

	public static void main(String[] args) {
//	public RopaCaballero(String nombre, String descripcion, int talla, String foto_uri, double precio) 
		
		RopaCaballero a = new RopaCaballero("a","a",1,"a",1);
		RopaCaballero b = new RopaCaballero("b","b",2,"b",2);
		RopaCaballero c = new RopaCaballero("c","c",3,"c",3);
		ArrayList<RopaCaballero> listProductos = new ArrayList<RopaCaballero>();
		listProductos.add(a);
		listProductos.add(b);
		listProductos.add(c);
		Iterator<RopaCaballero> i = listProductos.iterator();
		while(i.hasNext()) {
			RopaCaballero x = i.next();
			System.out.println(x.toString());
		}
		//	public RopaNino(String nombre, String foto_uri, double precio) 

		RopaNino d = new RopaNino("nombre1","fotos/foto1.jpg",12.5);
		RopaNino e = new RopaNino("nombre2","fotos/foto2.jpg",15.5);
		RopaNino f = new RopaNino("nombre3","fotos/foto3.jpg",18.5);
		ArrayList<RopaNino> listProductosNino = new ArrayList<RopaNino>();
		listProductosNino.add(d);
		listProductosNino.add(e);
		listProductosNino.add(f);
		Iterator<RopaNino> j = listProductosNino.iterator();
		while(j.hasNext()) {
			RopaNino x = j.next();
			System.out.println(x.toString());
		}
		
	}

}
