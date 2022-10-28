package com.example.manager_product.service;

import java.util.List;

import com.example.manager_product.entity.Product;

public interface ProductService {
	public Product saveProduct(Product product);
	 public List<Product> getProducts();
}
