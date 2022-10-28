package com.example.manager_product.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manager_product.entity.Product;
import com.example.manager_product.repository.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDaos;

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productDaos.save(product);
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return  productDaos.findAll();
	}


	
}
