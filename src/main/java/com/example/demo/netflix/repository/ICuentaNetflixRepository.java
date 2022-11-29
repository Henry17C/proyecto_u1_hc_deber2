package com.example.demo.netflix.repository;

import com.example.demo.netflix.modelo.CuentaNetflix;

public interface ICuentaNetflixRepository {
	public CuentaNetflix buscar(Integer id);
	public void actualizar (CuentaNetflix cuentaNetflix);
	public void insertar(CuentaNetflix cuentaNetflix);
	public void borrar(Integer id);
}
