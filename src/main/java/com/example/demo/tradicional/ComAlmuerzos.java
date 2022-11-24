package com.example.demo.tradicional;

public class ComAlmuerzos extends Comida {
	protected String sopa;
	protected String seco;	protected String juego;
	
	public String getSopa() {
		return sopa;
	}
	public void setSopa(String sopa) {
		this.sopa = sopa;
	}
	public String getSeco() {
		return seco;
	}

	public void setJuego(String juego) {
		this.juego = juego;
	}
	
	@Override
	public String toString() {
		return "ComAlmuerzos [sopa=" + sopa + ", seco=" + seco + ", juego=" + juego + "]";
	}
	
	
	

}
