package com.packt.webstore.repository;

import java.util.List;

import com.packt.webstore.domain.Product;


public interface ProductService {

	public List<Product> getListOfAllProducts();

	
}
