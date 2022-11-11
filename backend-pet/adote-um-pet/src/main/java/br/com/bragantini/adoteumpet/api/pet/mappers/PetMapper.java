package br.com.bragantini.adoteumpet.api.pet.mappers;

import org.springframework.stereotype.Component;

import br.com.bragantini.adoteumpet.api.pet.dtos.PetResponse;
import br.com.bragantini.adoteumpet.core.models.Pet;

@Component
public class PetMapper {
    
    
    public PetResponse toResponse(Pet pet) {
       var  petResponse = new PetResponse();
       petResponse.setId(pet.getId());
       petResponse.setName(pet.getName());
       petResponse.setHistoria(pet.getHistoria());
       petResponse.setFoto(pet.getFoto());
       return petResponse;
    }
}
