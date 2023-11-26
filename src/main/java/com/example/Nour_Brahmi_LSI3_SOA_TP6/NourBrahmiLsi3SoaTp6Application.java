package com.example.Nour_Brahmi_LSI3_SOA_TP6;

import com.example.Nour_Brahmi_LSI3_SOA_TP6.entities.Compte;
import com.example.Nour_Brahmi_LSI3_SOA_TP6.entities.TypeCompte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.Nour_Brahmi_LSI3_SOA_TP6.repositories.CompteRepository;

import java.util.Date;

@SpringBootApplication
public class NourBrahmiLsi3SoaTp6Application {

	public static void main(String[] args) {
		SpringApplication.run(NourBrahmiLsi3SoaTp6Application.class, args);
	}
	@Bean
	public CommandLineRunner start(CompteRepository compteRepository){
		return args -> {
			compteRepository.save(new Compte(null, 1222, new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 1002, new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 1200022, new Date(), TypeCompte.COURANT));
			compteRepository.findAll().forEach( c->{
				System.out.println("Solde de compte"+c.getId()+" : "+c.getSolde());
					}

			);
		};
	}
}

