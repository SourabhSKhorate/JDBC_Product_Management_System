package com.project_management.controller;

import com.project_management.service.CustomerService;

public class TestDeleteCustomerController {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		boolean res = customerService.deleteCustomerById(6);
		System.out.println(res);
	}

}
