package com.project_management.controller;

import com.project_management.service.ProductService;

public class TestGetAllByIdProductController {

	public static void main(String[] args) {
		ProductService productService = new ProductService();

		productService.getAllProductById(2);

	}

}
