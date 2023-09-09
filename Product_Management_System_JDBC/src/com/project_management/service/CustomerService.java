package com.project_management.service;

import com.project_management.dao.CustomerDao;
import com.project_management.dto.Customer;

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();

	public Customer saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

	public boolean deleteCustomerById(int id) {
		return customerDao.deleteCustomerById(id);
	}

	public boolean upadteCustomerById(int id, String email) {
		return customerDao.upadteCustomerById(id, email);
	}

	public Customer getAllCustomer(Customer customer) {
		return customerDao.getAllCustomer(customer);
	}

	public void getAllCustomerById(int id) {
		customerDao.getAllCustomerById(id);
	}

}
