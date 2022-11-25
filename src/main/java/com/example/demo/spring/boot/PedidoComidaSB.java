package com.example.demo.spring.boot;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class PedidoComidaSB {
	
	private String idPedido;
	private ArrayList<ComidaSB> listComida= new ArrayList();
	
	public void agregarPeido(ComidaSB comida,String idPedido) {
		this.idPedido=idPedido;
		
		ComidaSB platilloF=comida;
		
		

		
		listComida.add(platilloF);
		this.guardarPedido(this);
		
	}
	
	public void guardarPedido(PedidoComidaSB pp) {
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

	public ArrayList<ComidaSB> getListComida() {
		return listComida;
	}

	public void setListComida(ArrayList<ComidaSB> listComida) {
		this.listComida = listComida;
	}

	@Override
	public String toString() {
		return "PedidoComida [idPedido=" + idPedido + ", listComida=" + listComida + "]";
	}



	
	
	

}
