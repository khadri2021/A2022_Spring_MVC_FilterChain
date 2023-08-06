package com.khadri.spring.mvc.filter.chain.dispatcher.initializer;

import javax.servlet.Filter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.khadri.spring.mvc.filter.chain.config.AppConfig;
import com.khadri.spring.mvc.filter.chain.filter.AFilter;
import com.khadri.spring.mvc.filter.chain.filter.BFilter;
import com.khadri.spring.mvc.filter.chain.filter.CFilter;

@Component
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { AppConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] { new CFilter(),new BFilter(),new AFilter()};
	}

}
