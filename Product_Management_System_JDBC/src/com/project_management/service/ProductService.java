package com.project_management.service;

import com.project_management.dao.ProductDao;
import com.project_management.dto.Product;

public class ProductService {
	ProductDao productDao = new ProductDao();

	public Product saveProduct(Product product) {
		return productDao.saveProduct(product);
	}

	public boolean deleteProductById(int id) {
		return productDao.deleteProductById(id);
	}

	public boolean updateProductById(int id, double price) {
		return productDao.updateProductById(id, price);
	}

	public Product getAllProduct(Product product) {
		return productDao.getAllProduct(product);
	}

	public void getAllProductById(int id) {
		productDao.getAllProductById(id);
	}
}
