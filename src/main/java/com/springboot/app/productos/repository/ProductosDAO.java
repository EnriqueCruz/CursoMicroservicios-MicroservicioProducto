package com.springboot.app.productos.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.productos.entity.Producto;


public interface ProductosDAO extends CrudRepository<Producto, Long> {

	
	
}
