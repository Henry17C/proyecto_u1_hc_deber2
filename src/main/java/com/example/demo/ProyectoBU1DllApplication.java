package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.herencia.ComAlEjecutivoH;
import com.example.demo.spring.boot.ComAlCostenioSB;
import com.example.demo.spring.boot.ComAlEjecutivoSB;
import com.example.demo.spring.boot.PedidoComidaSB;



@SpringBootApplication
public class ProyectoBU1DllApplication implements CommandLineRunner{

	@Autowired
	private ComAlCostenioSB alm_cost;
	
	@Autowired
	private ComAlEjecutivoSB alm_Ejec;
	
	@Autowired
	private PedidoComidaSB pedidio;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoBU1DllApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("SPRING BOOT");
		System.out.println(pedidio);
		alm_cost.setCantidad("4");
		alm_cost.setIdentificador(1234321423);
		alm_cost.setNombre("Almuezo con encebollado");
		alm_cost.setPrecio(3.5f);
		alm_cost.setTipoC("ALM_COSTENIO");
		
		alm_cost.setSopa("ENCEBOLLADO");
		alm_cost.setJuego("TOMATE");
		
		alm_cost.setTipoCafe("AGUA");
		alm_cost.setTipoPescado("MAR");
		
		pedidio.agregarPeido(alm_cost, "asdfdsf");
		

		alm_Ejec.setCantidad("1");
		alm_Ejec.setIdentificador(1234235);
		alm_Ejec.setNombre("Almuezo bien");
		alm_Ejec.setPrecio(5f);
		alm_Ejec.setTipoC("ALM_EJECUTIVO");
		
		alm_Ejec.setSopa("ENCEBOLLADO");
		alm_Ejec.setJuego("TOMATE");
		
		alm_Ejec.setPostre("Panqueke");
		alm_Ejec.setExtra("SANDUCHE");
		
		pedidio.agregarPeido(alm_Ejec, "asdfdsf");
		


		
	}

}
