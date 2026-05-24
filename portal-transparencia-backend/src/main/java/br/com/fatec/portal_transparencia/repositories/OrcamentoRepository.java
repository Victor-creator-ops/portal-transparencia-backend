package br.com.fatec.portal_transparencia.repositories;

import br.com.fatec.portal_transparencia.models.Orcamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrcamentoRepository extends JpaRepository<Orcamento, Long> {
}