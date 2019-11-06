package com.uoesz.alumniplatform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AlumniPlatformApplication {

	private static Logger logger = LoggerFactory.getLogger(AlumniPlatformApplication.class);
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AlumniPlatformApplication.class, args);
		String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
		for (String profile : activeProfiles) {
			logger.info("*****************Spring Boot is using profile: " + profile + "******************");
		}
	}

}
