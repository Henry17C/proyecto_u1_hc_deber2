package com.example.demo.netflix.repository;

import com.example.demo.netflix.modelo.Usuario;

public interface IUsuarioRepository {

	public Usuario buscar(Integer id);
	public void actualizar (Usuario usuario);
	public void insertar(Usuario usuario);
	public void borrar(Integer id);
}
