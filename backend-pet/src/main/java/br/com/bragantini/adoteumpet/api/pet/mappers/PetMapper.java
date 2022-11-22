package br.com.bragantini.adoteumpet.api.pet.mappers;

import org.springframework.stereotype.Component;

import br.com.bragantini.adoteumpet.api.pet.dtos.PetRequest;
import br.com.bragantini.adoteumpet.api.pet.dtos.PetResponse;
import br.com.bragantini.adoteumpet.core.models.Pet;

@Component
public class PetMapper {
    
    
    public PetResponse toResponse(Pet pet) {
    
        return PetResponse.builder()
            .id(pet.getId())
            .name(pet.getName())
            .historia(pet.getHistoria())
            .foto(pet.getFoto())
            .build();
    }

    public Pet toModel(PetRequest petRequest) {
        return Pet.builder()
        .name(petRequest.getName())
        .historia(petRequest.getHistoria())
        .foto(petRequest.getFoto())
        .build();
    }
}
