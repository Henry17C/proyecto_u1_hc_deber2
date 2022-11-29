package com.example.demo.netflix.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.netflix.modelo.Usuario;

@Repository
public class UsuarioRepositoryImpl implements IUsuarioRepository {
	
	private static List<Usuario> usuario=new ArrayList<>();

	@Override
	public Usuario buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertar(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub

	}

}
