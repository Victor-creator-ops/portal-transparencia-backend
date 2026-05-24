package br.com.fatec.portal_transparencia.repositories;

import br.com.fatec.portal_transparencia.models.DividaPublica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DividaPublicaRepository extends JpaRepository<DividaPublica, Long> {
}