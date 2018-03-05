package com.tecsup.lab03.Alvarado;

public class AsocBebe {
	
	String [] pdto1 = {"Casaca", "cuero", "3"};
	String [] pdto2 = {"Gorro", "cuero", "4"};
	String [] pdto3 = {"Pantalon", "cuero", "5"};
	
    public void publicar(){
    	System.out.println("BEBE: ");
    	System.out.println("Prenda 1: ");
    	System.out.println("Detalles : Nombre"+pdto1[0]+ " Descripción :"+pdto1[1]+ " Talla :"+pdto1[2]);
    	System.out.println("Prenda 2: ");
    	System.out.println("Detalles : Nombre"+pdto2[0]+ " Descripción :"+pdto2[1]+ " Talla :"+pdto2[2]);
    	System.out.println("Prenda 3: ");
    	System.out.println("Detalles : Nombre"+pdto3[0]+ " Descripción :"+pdto3[1]+ " Talla :"+pdto3[2]);
    	
  
    }
}
//-	La asociación de ropas de bebe solo desea publicar los
//nombres de la prenda, su descripción, talla,  pero no el precio