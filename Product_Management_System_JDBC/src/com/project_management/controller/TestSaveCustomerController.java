package com.project_management.controller;

import com.project_management.dto.Customer;
import com.project_management.service.CustomerService;

public class TestSaveCustomerController {

	public static void main(String[] args) {

		Customer customer = new Customer();

		customer.setId(6);
		customer.setName("F");
		customer.setEmail("e@mail.com");

		CustomerService customerService = new CustomerService();
		Customer c = customerService.saveCustomer(customer);

		if (c != null) {
			System.out.println("Saved Successfully");
		}

	}

}
