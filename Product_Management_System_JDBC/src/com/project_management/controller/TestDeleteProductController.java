package com.project_management.controller;

import com.project_management.service.ProductService;

public class TestDeleteProductController {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		boolean res = productService.deleteProductById(6);
		System.err.println(res);

	}

}
