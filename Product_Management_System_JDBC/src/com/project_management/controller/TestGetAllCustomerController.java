package com.project_management.controller;

import com.project_management.dto.Customer;
import com.project_management.service.CustomerService;

public class TestGetAllCustomerController {

	public static void main(String[] args) {
		Customer customer = new Customer();

		CustomerService customerService = new CustomerService();
		customerService.getAllCustomer(customer);

	}

}
