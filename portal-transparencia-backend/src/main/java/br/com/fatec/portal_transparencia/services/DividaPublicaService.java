package br.com.fatec.portal_transparencia.services;

import br.com.fatec.portal_transparencia.models.DividaPublica;
import br.com.fatec.portal_transparencia.repositories.DividaPublicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DividaPublicaService {

    private final DividaPublicaRepository repository;

    public DividaPublicaService(DividaPublicaRepository repository) {
        this.repository = repository;
    }

    public List<DividaPublica> listarTodas() {
        return repository.findAll();
    }

    public Optional<DividaPublica> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public DividaPublica salvar(DividaPublica dividaPublica) {
        return repository.save(dividaPublica);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}