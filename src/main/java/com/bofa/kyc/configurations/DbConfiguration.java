package com.bofa.kyc.configurations;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfiguration {

	@Value("${url}")
	private String url;
	@Value("${usernamemysql}")
	private String userName;
	@Value("${password}")
	private String password;
	
	
	@Bean
	@ConditionalOnClass(DataSource.class)
	public DataSource getInstance() {
		DataSourceBuilder builder=DataSourceBuilder.create();
		builder.url(url);
		builder.username(userName);
		builder.password(password);
		return builder.build();
	}
	
}
