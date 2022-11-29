package com.example.demo.netflix.repository;

import com.example.demo.netflix.modelo.Targeta;

public interface ITargetaRepository {

	public Targeta buscar(Integer id);
	public void actualizar (Targeta targeta);
	public void insertar(Targeta targeta);
	public void borrar(Integer id);
}
