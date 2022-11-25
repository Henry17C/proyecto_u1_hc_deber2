package com.example.demo.herencia;

public class ComAlCostenioH extends ComAlmuerzosH {
	private String tipoCafe;
	private String tipoPescado;
	
	
	public String getTipoCafe() {
		return tipoCafe;
	}
	public void setTipoCafe(String tipoCafe) {
		this.tipoCafe = tipoCafe;
	}
	public String getTipoPescado() {
		return tipoPescado;
	}
	public void setTipoPescado(String tipoPescado) {
		this.tipoPescado = tipoPescado;
	}
	@Override
	public String toString() {
		return "ComAlCostenio [tipoCafe=" + tipoCafe + ", tipoPescado=" + tipoPescado + "]";
	}
	
	
	
}
