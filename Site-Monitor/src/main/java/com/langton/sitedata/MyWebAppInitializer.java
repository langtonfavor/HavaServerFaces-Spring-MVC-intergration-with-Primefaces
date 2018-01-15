package com.langton.sitedata;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class MyWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		// TODO Auto-generated method stub

//create the root application context....
		AnnotationConfigWebApplicationContext rootContext=new AnnotationConfigWebApplicationContext();
		rootContext.register(SpringConfiguration.class);
		
		///////manage the life cycle of the root application context...
		container.addListener(new ContextLoaderListener(rootContext));
	}

}
