package com.sistema.blog.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.blog.entidades.Comentario;

public interface ComentarioRepositorio extends JpaRepository<Comentario, Long>{

	public List<Comentario> findByPublicacionId(long publicacionId); 
	
}
