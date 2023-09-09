package com.project_management.controller;

import com.project_management.service.ProductService;

public class TestUpdateProductController {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		boolean res = productService.updateProductById(3, 999.99);
		System.out.println(res);

	}

}
