package com.serbatic.course;

import java.net.URL;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jMain {
	final static String MESSAGE_TEXT = "Hola Mundo!";

	private static Logger logger = LogManager.getLogger(Log4jMain.class);
	//private static Logger logger2 = LogManager.getLogger("infoLogger");
	
	public static void main(String[] args) {
		//BasicConfigurator.configure();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL url = loader.getResource("log4j.properties");
		PropertyConfigurator.configure(url);
		System.out.println(MESSAGE_TEXT);
		logger.info("Este es el fichero de configuración: " + url);
		logger.warn("Esto es un aviso");
		//logger2.debug("Esto es un debug");
	}

}
