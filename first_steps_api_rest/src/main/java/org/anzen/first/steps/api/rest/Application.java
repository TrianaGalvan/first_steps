/*
 * Copyright (c) 2018 Anzen Soluciones S.A. de C.V.
 * Mexico D.F.
 * All rights reserved.
 *
 * THIS SOFTWARE IS  CONFIDENTIAL INFORMATION PROPIETARY OF ANZEN SOLUCIONES.
 * THIS INFORMATION SHOULD NOT BE DISCLOSED AND MAY ONLY BE USED IN ACCORDANCE THE TERMS DETERMINED BY THE COMPANY ITSELF.
 */
package org.anzen.first.steps.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * <p></p>
 * 
 * @author Marco Acevedo {@literal <marcoacevedo@anzen.com.mx>}
 * @version first-steps-api-rest
 * @since first-steps-api-rest
 * @category
 */
@SpringBootApplication
@Configuration
public class Application {

	private static Class<Application> foo = Application.class;
	/**
	 * <p></p>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(foo, args);
	}
}
