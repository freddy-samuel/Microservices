package com.bofa.kyc.configurations;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bofa.kyc.filters.CustomerFilter;

@Configuration
public class CustomerFilterConfiguration {

	@Bean
	public FilterRegistrationBean getCustomerFilter() {
		FilterRegistrationBean filterBean=new FilterRegistrationBean();
		CustomerFilter customerFilter=new CustomerFilter();
		filterBean.setFilter(customerFilter);
		filterBean.addUrlPatterns("/getAllAppointments/*");
		return filterBean;
	}
}
