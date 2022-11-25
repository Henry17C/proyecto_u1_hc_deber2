package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class ComExtraSB extends ComidaSB {
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
