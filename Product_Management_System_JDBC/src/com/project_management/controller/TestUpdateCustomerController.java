package com.project_management.controller;

import com.project_management.service.CustomerService;

public class TestUpdateCustomerController {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();
		boolean res = customerService.upadteCustomerById(5, "ee@mail.com");
		System.out.println(res);
	}

}
