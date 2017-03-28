package com.test.rahul.spring.SpringLearn;

/**
 * Hello world!
 *
 */
public class App {
	/**
	 * @param args
	 *//*
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

		for (Products product : service.retrieveAllProducts()) {
			System.out.println(product);
		}
		
		for (ProductType productType : dataFacade.getAllProductTypes()) {
			System.out.println(productType);
		}
		
		crateWebService(service);
		
		ctx.close();
	}

	private static void crateWebService(ProductServices service) {
		Endpoint.publish("http://localhost:9999/ws/Productzz", service);
	}*/
}
