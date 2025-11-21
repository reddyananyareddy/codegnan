//21-11-2025
package com.codegnan.web;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class AppContextListner implements ServletContextListener {
	public void contextInitialized(ServletContextEvent sec) {
		ServletContext context=sec.getServletContext();
		context.setInitParameter("a","AAA");
		context.setInitParameter("b","BBB");
	}
}
