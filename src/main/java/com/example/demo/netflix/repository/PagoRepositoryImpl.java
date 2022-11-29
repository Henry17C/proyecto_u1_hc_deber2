package com.example.demo.netflix.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.demo.netflix.modelo.Pago;

@Repository
public class PagoRepositoryImpl implements IPagoRepository {
	private static List<Pago> pago=new ArrayList<>();
	@Override
	public Pago buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Pago pago) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertar(Pago pago) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub

	}

}
