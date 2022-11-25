package com.example.demo.herencia;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PedidoComidaH p1 = new PedidoComidaH();
		
		ComPlatosCartaH platillo1=new ComPlatosCartaH();
		platillo1.setCantidad("1");
		platillo1.setIdentificador(345677);
		platillo1.setNombre("Sushi");
		platillo1.setPrecio(13.2f);
		platillo1.setTipoC("CARTA");
		platillo1.setTipo("Sopa");
			
		
		ComExtraH platillo2=new ComExtraH();
		platillo2.setCantidad("5");
		platillo2.setIdentificador(3452534);
		platillo2.setNombre("wantan");
		platillo2.setPrecio(2.11f);
		platillo2.setTipoC("EXTRA");
		platillo2.setTipo("Dulce");
			

			
			ComAlCostenioH platillo3=new ComAlCostenioH();
			platillo3.setCantidad("4");
			platillo3.setIdentificador(1234321423);
			platillo3.setNombre("Almuezo con encebollado");
			platillo3.setPrecio(3.5f);
			platillo3.setTipoC("ALM_COSTENIO");
			
			platillo3.setSopa("ENCEBOLLADO");
			platillo3.setJuego("TOMATE");
			
			platillo3.setTipoCafe("AGUA");
			platillo3.setTipoPescado("MAR");
			

			
			ComAlEjecutivoH platillo4=new ComAlEjecutivoH();
			platillo4.setCantidad("1");
			platillo4.setIdentificador(1234235);
			platillo4.setNombre("Almuezo bien");
			platillo4.setPrecio(5f);
			platillo4.setTipoC("ALM_EJECUTIVO");
			
			platillo4.setSopa("ENCEBOLLADO");
			platillo4.setJuego("TOMATE");
			
			platillo4.setPostre("Panqueke");
			platillo4.setExtra("SANDUCHE");
			



		p1.agregarPeido(platillo4,"abc234");
		p1.agregarPeido(platillo3,"abc234");

	}

}
