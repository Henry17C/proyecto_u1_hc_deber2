package com.example.demo.netflix.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.netflix.modelo.CuentaNetflix;

@Repository
public class CuentaNetflixRepositoryImpl implements ICuentaNetflixRepository {

	private static List<CuentaNetflix> baseCuentaNetflix=new ArrayList<>();
	
	@Override
	public CuentaNetflix buscar(Integer id) {
		// TODO Auto-generated method stub
		CuentaNetflix cuenta= new CuentaNetflix();
		cuenta.setContrasenia("123456789");
		cuenta.setEmail("123456789@gmail.com");
		cuenta.setEstado(false);
		cuenta.setTipo("BASICA");
		
		return cuenta;
	}

	@Override
	public void actualizar(CuentaNetflix cuentaNetflix) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertar(CuentaNetflix cuentaNetflix) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub

	}

}
