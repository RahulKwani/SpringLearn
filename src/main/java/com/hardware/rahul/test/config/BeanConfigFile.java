package com.hardware.rahul.test.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import com.hardware.rahul.test.ProductCountBase;
/**
 * This class has multiple DataSource define in it with @Profile annotation of Spring framework
 * @author Rahul
 *
 */
@Configuration
@EnableJpaRepositories(basePackageClasses=ProductCountBase.class, repositoryImplementationPostfix="ExtendedImpl")	
@PropertySource("classpath:application.properties")
public class BeanConfigFile {
	
	@Autowired
	private Environment env;
	
	@Bean
	//@Profile("MYSQL_DB")
	public DataSource createDataSource(){
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName(env.getProperty("MySQL.ClassName"));
		driverManagerDataSource.setUrl(env.getProperty("MySQL.URL"));
		driverManagerDataSource.setUsername(env.getProperty("MySQL.UserName"));
		driverManagerDataSource.setPassword(env.getProperty("MySQL.Password"));
		return driverManagerDataSource;
	}
	@Bean
	//@Profile("MYSQL_DB")
	public JpaVendorAdapter createMYSQLJPAVendorAdapter(){
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(false);
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQL57InnoDBDialect");
		return adapter;
	}
	
	@Bean
	@Profile("EmbededDataDev")
	public DataSource embededDataSource(){
		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("classpath:application-sql/schema.sql")
				.addScript("classpath:application-sql/test-data.sql").build();
	}
	
	@Bean
	@Profile("EmbededDataDev")
	public JpaVendorAdapter createH2JPAVendorAdapter(){
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.H2);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabasePlatform("org.hibernate.dialect.H2Dialect");
		return adapter;
	}
	@Bean
	public JdbcTemplate createJdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public BeanPostProcessor persistenceTranslation() {
	return new PersistenceExceptionTranslationPostProcessor();
	}
	
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(emf);
		return txManager;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource , JpaVendorAdapter adapter){
		LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
		entityManager.setDataSource(dataSource);
		entityManager.setJpaVendorAdapter(adapter);
		entityManager.setPackagesToScan("com.hardware.rahul.test.model*");
		entityManager.afterPropertiesSet();
		return entityManager;
	}
	
}
