package com.test.rahul.spring.SpringLearn;

/**
 * Hello world!
 *
 */
public class App {
	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//ctx.getEnvironment().setActiveProfiles("MySQLDataSource");
		ctx.register(BeanConfigFile.class);
		ctx.register(ServletBeanConfig.cls);
		ctx.refresh();

		//DataFacade dataFacade = (DataFacade) ctx.getBean("dataFacade");
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
		
		ProductService productService = (ProductService) ctx.getBean("productService");
		for(Products product : productService.retrieveAllProducts()){
			System.out.println(product);
		}
		ctx.close();
	}*/

	/*private static void crateWebService(ProductServices service) {
		Endpoint.publish("http://localhost:9999/ws/Productzz", service);
	}*/
	
	
	/*public static void main(String[] args) {
		Md5PasswordEncoder encoder =  new Md5PasswordEncoder();
		String encodedPassword = encoder.encodePassword("admin", "147");
		System.out.println("Encoded password 0 : " + encodedPassword);
		System.out.println("Encoded password 1 : " +  encoder.encodePassword("password", "147"));
		System.out.println("Checking passwword validity: " + encoder.isPasswordValid(encodedPassword, "Rahul", "1"));
		System.out.println("Checking passwword validity: " + encoder.isPasswordValid(encodedPassword, "Rahul", "0"));
		
		System.out.println(encoder.getAlgorithm());
		
		System.out.println(encoder.encodePassword("admin", "147"));
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode("admin");
		System.out.println("BCrypted :" + hashedPassword);
		hashedPassword = passwordEncoder.encode("password");
		System.out.println("BCrypted :" + hashedPassword);
	}*/
}
