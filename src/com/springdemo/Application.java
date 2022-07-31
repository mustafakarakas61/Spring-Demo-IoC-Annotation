package com.springdemo;

import com.springdemo.config.IocConfig;
import com.springdemo.service.ICustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		//context.refresh();
		
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		customerService.add();

	}
}
// CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDal.class));//Bu yaptığımız Dependency Injection,Spring ise bu
// manager.add();
// üretimi bizim için kendi yapacak, IoC yi kendi yapıyor SPRİNG BURAYI YAPIYOR>
// new CustomerManager(new CustomerDal()); Bize burada spring bizim için
// nesneler üretecek
//IoC - Inversion of Control - Birbirinin alternatifi olan işleri yönetiyoruz
// Dependency Injection
// Spagetti - Karışık Kodlar
// SOLİD