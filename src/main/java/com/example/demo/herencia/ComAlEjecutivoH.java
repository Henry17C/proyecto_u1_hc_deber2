package com.example.demo.herencia;

public class ComAlEjecutivoH extends ComAlmuerzosH {
	private String postre;
	private String extra;
	public String getPostre() {
		return postre;
	}
	public void setPostre(String postre) {
		this.postre = postre;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	@Override
	public String toString() {
		return "ComAlEjecutivo [postre=" + postre + ", extra=" + extra + "]";
	}
	
	
	
	
}
