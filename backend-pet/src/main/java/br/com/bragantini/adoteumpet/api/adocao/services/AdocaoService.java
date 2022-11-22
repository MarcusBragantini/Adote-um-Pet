package br.com.bragantini.adoteumpet.api.adocao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bragantini.adoteumpet.api.adocao.dtos.AdocaoRequest;
import br.com.bragantini.adoteumpet.api.adocao.dtos.AdocaoResponse;
import br.com.bragantini.adoteumpet.api.adocao.mappers.AdocaoMapper;
import br.com.bragantini.adoteumpet.core.repositories.AdocaoRepository;

@Service
public class AdocaoService {
    
    @Autowired
    private AdocaoRepository adocaoRepository;

    @Autowired
    AdocaoMapper adocaoMapper;

    public AdocaoResponse create(AdocaoRequest adocaoRequest){
        var adocaoToCreate = adocaoMapper.toModel(adocaoRequest);
        var createdAdocao = adocaoRepository.save(adocaoToCreate);
        return adocaoMapper.toResponse(createdAdocao);
    }

    public List<AdocaoResponse> findAll(){
        return adocaoRepository.findAll()
        .stream()
        .map(adocaoMapper::toResponse)
        .toList();
    }
}
