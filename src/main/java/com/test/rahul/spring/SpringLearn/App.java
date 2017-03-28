package com.test.rahul.spring.SpringLearn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hardware.rahul.test.model.ProductType;
import com.hardware.rahul.test.model.Products;
import com.test.rahul.spring.config.BeanConfigFile;
import com.test.rahul.spring.facade.DataFacade;
import com.test.rahul.spring.model.Users;
import com.test.rahul.spring.service.SpringLearnService;

/**
 * Hello world!
 *
 */
public class App {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("MySQLDataSource");
		ctx.register(BeanConfigFile.class);
		ctx.refresh();

		DataFacade dataFacade = (DataFacade) ctx.getBean("dataFacade");
		SpringLearnService service = (SpringLearnService) ctx.getBean("springLearnService");
		dataFacade.printData();
		for (Users user : service.getAllUsers()) {
			System.out.println(user);
		}

		for (Products product : dataFacade.getAllProducts()) {
			System.out.println(product);
		}
		
		for (ProductType productType : dataFacade.getAllProductTypes()) {
			System.out.println(productType);
		}
		ctx.close();
	}
}
