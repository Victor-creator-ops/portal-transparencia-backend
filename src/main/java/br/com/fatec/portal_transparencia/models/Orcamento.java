package br.com.fatec.portal_transparencia.models;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "orcamentos")
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ano_exercicio", nullable = false)
    private Integer anoExercicio;

    @Column(name = "valor_previsto", nullable = false, precision = 15, scale = 2)
    private BigDecimal valorPrevisto;

    @Column(name = "valor_executado", nullable = false, precision = 15, scale = 2)
    private BigDecimal valorExecutado;

    @ManyToOne
    @JoinColumn(name = "id_fonte", referencedColumnName = "id")
    private FonteDados fonteDados;

    public Orcamento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAnoExercicio() {
        return anoExercicio;
    }

    public void setAnoExercicio(Integer anoExercicio) {
        this.anoExercicio = anoExercicio;
    }

    public BigDecimal getValorPrevisto() {
        return valorPrevisto;
    }

    public void setValorPrevisto(BigDecimal valorPrevisto) {
        this.valorPrevisto = valorPrevisto;
    }

    public BigDecimal getValorExecutado() {
        return valorExecutado;
    }

    public void setValorExecutado(BigDecimal valorExecutado) {
        this.valorExecutado = valorExecutado;
    }

    public FonteDados getFonteDados() {
        return fonteDados;
    }

    public void setFonteDados(FonteDados fonteDados) {
        this.fonteDados = fonteDados;
    }
}