package br.com.fatec.portal_transparencia.services;

import br.com.fatec.portal_transparencia.models.CategoriaTematica;
import br.com.fatec.portal_transparencia.repositories.CategoriaTematicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaTematicaService {
    private final CategoriaTematicaRepository repository;

    public CategoriaTematicaService(CategoriaTematicaRepository repository) {
        this.repository = repository;
    }

    public List<CategoriaTematica> listarTodas() {
        return repository.findAll(); //o repository faz o SELECT * automático
    }

    public Optional<CategoriaTematica> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public CategoriaTematica salvar(CategoriaTematica categoria) {
        return repository.save(categoria); //o repository faz o INSERT ou UPDATE automático
    }
    
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}