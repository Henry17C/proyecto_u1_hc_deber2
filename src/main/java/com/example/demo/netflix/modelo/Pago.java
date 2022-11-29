package com.example.demo.netflix.modelo;

import java.math.BigDecimal;

public class Pago {
	private CuentaNetflix cuentaNetflix;
	private Targeta targeta;
	private BigDecimal monto;
	
	
	//GET Y SET
	public CuentaNetflix getCuentaNetflix() {
		return cuentaNetflix;
	}
	public void setCuentaNetflix(CuentaNetflix cuentaNetflix) {
		this.cuentaNetflix = cuentaNetflix;
	}
	public Targeta getTargeta() {
		return targeta;
	}
	public void setTargeta(Targeta targeta) {
		this.targeta = targeta;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
	
	

}
