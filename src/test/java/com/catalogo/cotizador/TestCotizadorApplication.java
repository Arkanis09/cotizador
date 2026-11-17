package com.catalogo.cotizador;

import org.springframework.boot.SpringApplication;

public class TestCotizadorApplication {

	public static void main(String[] args) {
		SpringApplication.from(CotizadorApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
