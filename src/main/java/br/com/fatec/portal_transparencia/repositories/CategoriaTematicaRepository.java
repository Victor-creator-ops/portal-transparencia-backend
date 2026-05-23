package br.com.fatec.portal_transparencia.repositories;

import br.com.fatec.portal_transparencia.models.CategoriaTematica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaTematicaRepository extends JpaRepository<CategoriaTematica, Long> {
}