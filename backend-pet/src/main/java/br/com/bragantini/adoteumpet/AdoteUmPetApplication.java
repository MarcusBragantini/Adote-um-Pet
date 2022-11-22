package br.com.bragantini.adoteumpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.bragantini.adoteumpet.core.models.Pet;
import br.com.bragantini.adoteumpet.core.repositories.PetRepository;

@SpringBootApplication
public class AdoteUmPetApplication implements CommandLineRunner {

	@Autowired
	private PetRepository petRepository;
	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet = new Pet();
		pet.setName("Jorel");
		pet.setHistoria("Muito carinhoso");
		pet.setFoto("https://i.pinimg.com/originals/40/45/fe/4045fe5588b0309604ef0b9e6edd381f.png");
		petRepository.save(pet);

		var pet1 = new Pet();
		pet1.setName("Jotinha");
		pet1.setHistoria("Muito carente");
		pet1.setFoto("https://thumbs.dreamstime.com/b/gato-dom%C3%A9stico-preto-e-branco-de-shorthair-91429809.jpg");
		petRepository.save(pet1);
		
	}

}
