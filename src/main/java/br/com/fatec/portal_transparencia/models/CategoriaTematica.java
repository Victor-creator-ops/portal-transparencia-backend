package br.com.fatec.portal_transparencia.models;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias_tematicas")
public class CategoriaTematica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_categoria", nullable = false, length = 100)
    private String nomeCategoria;

    @Column(name = "descricao_simplificada", columnDefinition = "TEXT")
    private String descricaoSimplificada;

    public CategoriaTematica() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getDescricaoSimplificada() {
        return descricaoSimplificada;
    }

    public void setDescricaoSimplificada(String descricaoSimplificada) {
        this.descricaoSimplificada = descricaoSimplificada;
    }
}