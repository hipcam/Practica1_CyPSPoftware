package com.tecsup.lab03.Alvarado;

public class AsocDama {
	String [] pdto1 = {"Chalina", "cuero", "3", "35.00"};
	String [] pdto2 = {"Blusa", "seda", "4", "13.00"};
	String [] pdto3 = {"Botas", "cuero", "5", "90.50"};
	
    public void publicar(){
    	System.out.println("DAMA: ");
    	System.out.println("Prenda 1: ");
    	System.out.println("Detalles : Nombre"+pdto1[0]+ " Descripción :"+pdto1[1]+ " Talla :"+pdto1[2]+ " Precio: "+pdto1[3]);
    	System.out.println("Prenda 2: ");
    	System.out.println("Detalles : Nombre"+pdto2[0]+ " Descripción :"+pdto2[1]+ " Talla :"+pdto2[2]+ " Precio: "+pdto2[3]);
    	System.out.println("Prenda 3: ");
    	System.out.println("Detalles : Nombre"+pdto3[0]+ " Descripción :"+pdto3[1]+ " Talla :"+pdto3[2]+ " Precio: "+pdto3[3]);
    	
  
    }
}


//-	La asociación de ropa de damas desea publicar
//los nombres de la prenda, su descripción, talla y el precio