package com.fluxo.fxcx;

import com.fluxo.fxcx.restAPI.transaction.Transaction;
import com.fluxo.fxcx.restAPI.transaction.JdbcTransactionRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class FluxodecaixaApplication implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(FluxodecaixaApplication.class);

	@Autowired
	private JdbcTransactionRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(FluxodecaixaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");

		repository.save(new Transaction(1L, "Casa", "Escritório", "Monitorres gamer", "out", "Kabum Comércio Eletrônico", 3500l));
		repository.save(new Transaction(2L, "Casa", "Cozinha", "Fogão", "out", "Casas Bahia", 1266l));
		repository.save(new Transaction(3L, "Casa", "Escritório", "Suporte para monitor F80N", "out", "Amazon", 632l));
		repository.save(new Transaction(4L, "Casa", "Escritório", "Fita led WiFi", "out", "Amazon", 169l));

		System.out.println("\nfindAll()");
		repository.findAll().forEach(x -> System.out.println(x));

		System.out.println("\nfindByName('Node')");
		//repository.findByName("Node").forEach(x -> System.out.println(x));
	}


}
