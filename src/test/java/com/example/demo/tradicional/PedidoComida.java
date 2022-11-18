package com.example.demo.tradicional;

import java.util.ArrayList;

public class PedidoComida {
	
	private String idPedido;
	private ArrayList<Comida> listComida= new ArrayList();
	
	public void agregarPeido(String idPedido, String nombreComida,
			double identificadorComida, float precioComida, 
			String cantidadComida, String tipoComida) {
		this.idPedido=idPedido;
		
		Comida platilloF=null;
		if (tipoComida.equals("CARTA")) {
			ComPlatosCarta platillo=new ComPlatosCarta();
			platillo.setCantidad(cantidadComida);
			platillo.setIdentificador(identificadorComida);
			platillo.setNombre(nombreComida);
			platillo.setPrecio(precioComida);
			platillo.setTipoC(tipoComida);
			platillo.setTipo("Sopa");
			
			platilloF=platillo;
			
		}else if(tipoComida.equals("EXTRA")){
			ComExtra platillo=new ComExtra();
			platillo.setCantidad(cantidadComida);
			platillo.setIdentificador(identificadorComida);
			platillo.setNombre(nombreComida);
			platillo.setPrecio(precioComida);
			platillo.setTipoC(tipoComida);
			platillo.setTipo("Dulce");
			
			platilloF=platillo;
			
		}else if(tipoComida.equals("ALM_COSTENIO")) {
			ComAlCostenio platillo=new ComAlCostenio();
			platillo.setCantidad(cantidadComida);
			platillo.setIdentificador(identificadorComida);
			platillo.setNombre(nombreComida);
			platillo.setPrecio(precioComida);
			platillo.setTipoC(tipoComida);
			
			platillo.setSopa("ENCEBOLLADO");
			platillo.setJuego("TOMATE");
			
			platillo.setTipoCafe("AGUA");
			platillo.setTipoPescado("MAR");
			
			platilloF=platillo;
			
		}else if(tipoComida.equals("ALM_EJECUTIVO")){
			ComAlEjecutivo platillo=new ComAlEjecutivo();
			platillo.setCantidad(cantidadComida);
			platillo.setIdentificador(identificadorComida);
			platillo.setNombre(nombreComida);
			platillo.setPrecio(precioComida);
			platillo.setTipoC(tipoComida);
			
			platillo.setSopa("ENCEBOLLADO");
			platillo.setJuego("TOMATE");
			
			platillo.setPostre("Panqueke");
			platillo.setExtra("SANDUCHE");
			
			platilloF=platillo;
			
		}else {
			System.out.println("Error");
		}
		

		
		listComida.add(platilloF);
		this.guardarPedido(this);
		
	}
	
	public void guardarPedido(PedidoComida pp) {
		//se guarda
		System.out.println(pp);
		
	}
	
	//gets y sets
	public String getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}

	public ArrayList<Comida> getListComida() {
		return listComida;
	}

	public void setListComida(ArrayList<Comida> listComida) {
		this.listComida = listComida;
	}

	@Override
	public String toString() {
		return "PedidoComida [idPedido=" + idPedido + ", listComida=" + listComida + "]";
	}



	
	
	

}
