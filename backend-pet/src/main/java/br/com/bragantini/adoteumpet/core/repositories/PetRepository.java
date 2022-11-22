package br.com.bragantini.adoteumpet.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bragantini.adoteumpet.core.exceptions.PetNotFoundException;
import br.com.bragantini.adoteumpet.core.models.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {
    
    default Pet findByIdOrElseThrow(Long id){
        
        return findById(id)
            .orElseThrow(PetNotFoundException::new);
    }
}