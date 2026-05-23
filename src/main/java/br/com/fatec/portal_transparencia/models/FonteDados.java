package br.com.fatec.portal_transparencia.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity //avisa que a classe é uma tabela de banco de dados
@Table(name = "fontes_dados")
public class FonteDados {

  @Id //diz que id é a chave primaria e com autoincremento
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nome_fonte", nullable = false, length = 100)
  private String nomeFonte;

  @Column(name = "url_origem")
  private String urlOrigem;

  @Column(name = "data_ultima_atualizacao", nullable = false)
  private LocalDateTime dataUltimaAtualizacao;

  public FonteDados(){}

  // Getters e Setters
  public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFonte() {
        return nomeFonte;
    }

    public void setNomeFonte(String nomeFonte) {
        this.nomeFonte = nomeFonte;
    }

    public String getUrlOrigem() {
        return urlOrigem;
    }

    public void setUrlOrigem(String urlOrigem) {
        this.urlOrigem = urlOrigem;
    }

    public LocalDateTime getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }
}
