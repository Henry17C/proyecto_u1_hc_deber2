package com.example.demo.netflix.modelo;

public class Usuario {
	private CuentaNetflix cuentaNetflix;
	private String nick;
	private String pin;
	
	//GEY Y SET
	public CuentaNetflix getCuentaNetflix() {
		return cuentaNetflix;
	}
	public void setCuentaNetflix(CuentaNetflix cuentaNetflix) {
		this.cuentaNetflix = cuentaNetflix;
	}
	public String getNick() {
		return nick;
	}
	
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
}
