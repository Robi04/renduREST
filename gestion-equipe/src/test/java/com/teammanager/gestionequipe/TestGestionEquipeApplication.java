package com.teammanager.gestionequipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestGestionEquipeApplication {

	public static void main(String[] args) {
		SpringApplication.from(GestionEquipeApplication::main).with(TestGestionEquipeApplication.class).run(args);
	}

}
