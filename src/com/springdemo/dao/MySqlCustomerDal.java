package com.springdemo.dao;

import com.springdemo.service.ICustomerDal;
import org.springframework.beans.factory.annotation.Value;

public class MySqlCustomerDal implements ICustomerDal {
	@Value("${database.connectionString}")
	String connectionString;
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("Connection String " + this.connectionString);
		System.out.println("MySql veritabanına eklendi");

	}
}