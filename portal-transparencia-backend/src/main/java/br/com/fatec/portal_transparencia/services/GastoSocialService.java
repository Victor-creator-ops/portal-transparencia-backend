package br.com.fatec.portal_transparencia.services;

import br.com.fatec.portal_transparencia.models.GastoSocial;
import br.com.fatec.portal_transparencia.repositories.GastoSocialRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GastoSocialService {

    private final GastoSocialRepository repository;

    public GastoSocialService(GastoSocialRepository repository) {
        this.repository = repository;
    }

    public List<GastoSocial> listarTodos() {
        return repository.findAll();
    }

    public Optional<GastoSocial> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public GastoSocial salvar(GastoSocial gastoSocial) {
        return repository.save(gastoSocial);
    }
    
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}