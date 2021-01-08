package com.springboot.app.productos.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.productos.entity.Producto;
import com.springboot.app.productos.service.ProductoServiceImpl;

@RestController
public class ProductoController {

	@Autowired
	private Environment environment;
	
	@Autowired
	ProductoServiceImpl productoService;
	
	@RequestMapping(value = "/producto", method = RequestMethod.GET)
	public List<Producto> listarProductos() {
		return productoService.findAll().stream().map(producto ->{
			producto.setPort(Integer.valueOf(environment.getProperty("local.server.port")));
			return producto;
		}).collect(Collectors .toList());
	}
	
	@RequestMapping(value = "/producto/{id}", method = RequestMethod.GET)
	public Producto getProducto(@PathVariable(name = "id") Long id) {
		Producto producto = productoService.findProductoById(id);
		producto.setPort(Integer.valueOf(environment.getProperty("local.server.port")));
		return producto;
	}

}
