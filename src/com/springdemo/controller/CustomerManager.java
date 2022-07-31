package com.springdemo.controller;

import com.springdemo.service.ICustomerDal;
import com.springdemo.service.ICustomerService;

public class CustomerManager implements ICustomerService {
	private ICustomerDal customerDal;

	// constructor injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// İş kuralları
		customerDal.add();

	}
}
