package com.example.demo.netflix.modelo;

import java.time.LocalDateTime;

public class Targeta {
	private String tipo;
	private String empresaProveedora;
	private String numero;
	private String CSV;
	private LocalDateTime fechaExpiracion;
	
	//GET Y SET
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEmpresaProveedora() {
		return empresaProveedora;
	}
	public void setEmpresaProveedora(String empresaProveedora) {
		this.empresaProveedora = empresaProveedora;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCSV() {
		return CSV;
	}
	public void setCSV(String cSV) {
		CSV = cSV;
	}
	public LocalDateTime getFechaExpiracion() {
		return fechaExpiracion;
	}
	public void setFechaExpiracion(LocalDateTime fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	

}
