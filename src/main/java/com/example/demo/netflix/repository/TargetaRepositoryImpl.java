package com.example.demo.netflix.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.demo.netflix.modelo.Targeta;

@Repository
public class TargetaRepositoryImpl implements ITargetaRepository {
	private static List<Targeta> targeta=new ArrayList<>();
	@Override
	public Targeta buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Targeta targeta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertar(Targeta targeta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub

	}

}
