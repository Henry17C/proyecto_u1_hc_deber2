package com.example.demo.tradicional;

public class Comida {
	protected String nombre;
	protected double identificador;
	protected float precio;
	protected String cantidad;
	protected String tipoC;

	
	
	//gets y sets
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getIdentificador() {
		return identificador;
	}
	public void setIdentificador(double identificador) {
		this.identificador = identificador;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getTipoC() {
		return tipoC;
	}
	public void setTipoC(String tipoC) {
		this.tipoC = tipoC;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "Comida [nombre=" + nombre + ", identificador=" + identificador + ", precio=" + precio + ", cantidad="
				+ cantidad + ", tipoC=" + tipoC + "]";
	}
	
	
	
	

}
