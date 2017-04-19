package com.hardware.rahul.test.config;

import static com.hardware.rahul.test.utils.ProductKeyConstant.RETRIEVE_PASSWORD;
import static com.hardware.rahul.test.utils.ProductKeyConstant.RETRIEVE_ROLE;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;

import com.hardware.rahul.test.model.Roles;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(RETRIEVE_PASSWORD)
		.authoritiesByUsernameQuery(RETRIEVE_ROLE).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	private CsrfTokenRepository csrfTokenRepository() 
	{ 
	    HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository(); 
	    repository.setSessionAttributeName("_csrf");
	    return repository; 
	}
	
	@Override
	 protected void configure(HttpSecurity http) throws Exception {
	     http.csrf()
	     .csrfTokenRepository(csrfTokenRepository());
	     http.formLogin()
	     .loginPage("/login").defaultSuccessUrl("/Dashboard").and().rememberMe().tokenValiditySeconds(241955).key("RahulHardware").and().logout().logoutSuccessUrl("/logout")
	     .and().authorizeRequests().antMatchers("Dashboard" , "Products").hasAnyRole(Roles.ADMIN.toString())
	     //.antMatchers(HttpMethod.POST , "").authenticated()
	     .anyRequest().permitAll();
	}
}
