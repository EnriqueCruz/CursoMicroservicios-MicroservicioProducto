package com.springboot.app.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.productos.entity.Producto;
import com.springboot.app.productos.service.ProductoServiceImpl;

@RestController
public class ProductoController {
	
	@Autowired
	ProductoServiceImpl productoService;
	
	@RequestMapping(value = "/producto", method = RequestMethod.GET)
	public List<Producto> listarProductos() {
		return productoService.findAll();
	}
	
	@RequestMapping(value = "/producto/{id}", method = RequestMethod.GET)
	public Producto getProducto(@PathVariable(name = "id") Long id) {
		return productoService.findProductoById(id);
	}

}
