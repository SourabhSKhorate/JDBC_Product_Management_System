package com.project_management.controller;

import com.project_management.dto.Product;
import com.project_management.service.ProductService;

public class TestGetAllProductController {

	public static void main(String[] args) {
		Product product = new Product();

		ProductService productService = new ProductService();
		productService.getAllProduct(product);
	}

}
