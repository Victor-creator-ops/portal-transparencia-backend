package br.com.fatec.portal_transparencia.services;

import br.com.fatec.portal_transparencia.models.Orcamento;
import br.com.fatec.portal_transparencia.repositories.OrcamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrcamentoService {

    private final OrcamentoRepository repository;

    public OrcamentoService(OrcamentoRepository repository) {
        this.repository = repository;
    }

    public List<Orcamento> listarTodos() {
        return repository.findAll();
    }

    public Optional<Orcamento> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Orcamento salvar(Orcamento orcamento) {
        return repository.save(orcamento);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}