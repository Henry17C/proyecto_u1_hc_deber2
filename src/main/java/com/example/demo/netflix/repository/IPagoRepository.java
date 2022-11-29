package com.example.demo.netflix.repository;

import com.example.demo.netflix.modelo.Pago;

public interface IPagoRepository {

	public Pago buscar(Integer id);
	public void actualizar (Pago pago);
	public void insertar(Pago pago);
	public void borrar(Integer id);
}
