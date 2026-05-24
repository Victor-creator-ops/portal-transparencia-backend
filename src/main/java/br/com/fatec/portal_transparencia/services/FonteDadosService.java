package br.com.fatec.portal_transparencia.services;

import br.com.fatec.portal_transparencia.models.FonteDados;
import br.com.fatec.portal_transparencia.repositories.FonteDadosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FonteDadosService {

    private final FonteDadosRepository repository;

    public FonteDadosService(FonteDadosRepository repository) {
        this.repository = repository;
    }

    public List<FonteDados> listarTodas() {
        return repository.findAll();
    }

    public Optional<FonteDados> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public FonteDados salvar(FonteDados fonteDados) {
        return repository.save(fonteDados);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}