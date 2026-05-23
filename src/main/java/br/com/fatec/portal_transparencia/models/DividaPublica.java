package br.com.fatec.portal_transparencia.models;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "dividas_publicas")
public class DividaPublica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ano_exercicio", nullable = false)
    private Integer anoExercicio;

    @Column(name = "mes_referencia", nullable = false)
    private Integer mesReferencia;

    @Column(name = "valor_saldo", nullable = false, precision = 15, scale = 2)
    private BigDecimal valorSaldo;

    @Column(name = "tipo_divida", nullable = false, length = 50)
    private String tipoDivida;

    @ManyToOne
    @JoinColumn(name = "id_fonte", referencedColumnName = "id")
    private FonteDados fonteDados;

    public DividaPublica() {
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

    public Integer getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(Integer mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public BigDecimal getValorSaldo() {
        return valorSaldo;
    }

    public void setValorSaldo(BigDecimal valorSaldo) {
        this.valorSaldo = valorSaldo;
    }

    public String getTipoDivida() {
        return tipoDivida;
    }

    public void setTipoDivida(String tipoDivida) {
        this.tipoDivida = tipoDivida;
    }

    public FonteDados getFonteDados() {
        return fonteDados;
    }

    public void setFonteDados(FonteDados fonteDados) {
        this.fonteDados = fonteDados;
    }
}