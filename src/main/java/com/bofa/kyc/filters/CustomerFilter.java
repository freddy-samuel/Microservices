package com.bofa.kyc.filters;

import java.io.IOException;
import java.util.Random;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerFilter implements Filter {

	Logger logger = LoggerFactory.getLogger(CustomerFilter.class);

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filter)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) req;
		HttpServletResponse httpResponse = (HttpServletResponse) res;
		logger.info("inside filter" + req.getRemoteHost());
		/*if (req.getRemoteHost().equals("0:0:0:0:0:0:0:1")) {
			throw new RuntimeException("Generated error code" + getExitCode() + ":Some error mess");
		}*/
		filter.doFilter(req, res);

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Filter.super.init(filterConfig);
		logger.info("inside init");
	}

	@Override
	public void destroy() {
		Filter.super.destroy();
		logger.info("inside destroy");
	}

	public int getExitCode() {
		return new Random().nextInt(10000);
	}

}
