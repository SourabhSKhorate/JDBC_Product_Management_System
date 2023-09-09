package com.project_management.controller;

import com.project_management.service.CustomerService;

public class TestGetAllByIdCustomerController {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		customerService.getAllCustomerById(3);

	}

}
