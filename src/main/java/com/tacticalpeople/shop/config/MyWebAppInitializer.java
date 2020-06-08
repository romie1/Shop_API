package com.tacticalpeople.shop.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	/**
	 * RootConfigClasses is AppConfig
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		return new Class[] {AppConfig.class};
	}

	/**
	 * ServletConfigClasses is WebConfig
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings()
	{
		return new String[] {"/"};
	}

}
