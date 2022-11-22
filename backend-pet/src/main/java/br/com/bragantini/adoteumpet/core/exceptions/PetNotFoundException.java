package br.com.bragantini.adoteumpet.core.exceptions;

import javax.persistence.EntityNotFoundException;

public class PetNotFoundException extends EntityNotFoundException {

    public PetNotFoundException() {
        super("Pet não encontardo!");
    }

    public PetNotFoundException(String message) {
        super(message);
    }
    
}
