package com.project_management.controller;

import com.project_management.dto.Product;
import com.project_management.service.ProductService;

public class TestSaveProductController {

	public static void main(String[] args) {

		Product product = new Product();

		product.setId(6);
		product.setName("F");
		product.setPrice(145.50);

		ProductService productService = new ProductService();
		Product p = productService.saveProduct(product);

		if (p != null) {
			System.out.println("Saved Successfully");
		}

	}

}
