package com.springboot.app.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.productos.entity.Producto;
import com.springboot.app.productos.repository.ProductosDAO;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	ProductosDAO productoDAO;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDAO.findAll();
	}

	@Override
	public Producto findProductoById(Long id) {
		// TODO Auto-generated method stub
		return productoDAO.findById(id).orElse(null);
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(Producto producto) {
		// TODO Auto-generated method stub
		
	}

}
