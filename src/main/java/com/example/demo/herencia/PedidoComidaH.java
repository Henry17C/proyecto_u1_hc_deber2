package com.example.demo.herencia;

import java.util.ArrayList;

public class PedidoComidaH {
	
	private String idPedido;
	private ArrayList<ComidaH> listComida= new ArrayList();
	
	public void agregarPeido(ComidaH comida,String idPedido) {
		this.idPedido=idPedido;
		
		ComidaH platilloF=comida;
		
		

		
		listComida.add(platilloF);
		this.guardarPedido(this);
		
	}
	
	public void guardarPedido(PedidoComidaH pp) {
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

	public ArrayList<ComidaH> getListComida() {
		return listComida;
	}

	public void setListComida(ArrayList<ComidaH> listComida) {
		this.listComida = listComida;
	}

	@Override
	public String toString() {
		return "PedidoComida [idPedido=" + idPedido + ", listComida=" + listComida + "]";
	}



	
	
	

}
