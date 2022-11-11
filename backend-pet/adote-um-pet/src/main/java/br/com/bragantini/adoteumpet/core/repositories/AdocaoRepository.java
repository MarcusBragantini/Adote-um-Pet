package br.com.bragantini.adoteumpet.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bragantini.adoteumpet.core.models.Adocao;

public interface AdocaoRepository extends JpaRepository<Adocao, Long> {
    
}
