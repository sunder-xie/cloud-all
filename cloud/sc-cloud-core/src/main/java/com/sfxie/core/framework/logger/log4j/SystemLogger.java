package com.sfxie.core.framework.logger.log4j;

import org.apache.log4j.Logger;

public class SystemLogger {
	public static Logger instance(Class<?> curentClass) {
		Logger logger = Logger.getLogger(curentClass.getName());
		return logger;
	}
}
