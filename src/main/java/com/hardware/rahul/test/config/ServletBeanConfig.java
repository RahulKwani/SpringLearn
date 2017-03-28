package com.hardware.rahul.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.hardware.rahul.test.ProductCountBase;
import com.test.rahul.spring.ComponentScanMarker;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses= {ComponentScanMarker.class, ProductCountBase.class})
public class ServletBeanConfig {

}
