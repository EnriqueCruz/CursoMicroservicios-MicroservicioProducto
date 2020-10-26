package com.springboot.app.productos.service;

import java.util.List;

import com.springboot.app.productos.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	
	public Producto findProductoById(Long id);
	
	public void deleteProduct(Long id);
	
	public void updateProduct(Producto producto);

}
