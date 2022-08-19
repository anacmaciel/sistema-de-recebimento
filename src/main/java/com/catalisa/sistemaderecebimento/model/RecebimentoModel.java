package com.catalisa.sistemaderecebimento.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "registro_recebimento")
public class RecebimentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long indice;
    @Column(length = 100, nullable = false)
    private String formaDeRecebimento;
    @Column(name = "valor_a_receber", length = 100, nullable = false)
    private BigDecimal valorAReceber;
    @Column(name = "desconto_recebimento", length = 100, nullable = false)
    private BigDecimal descontoRecebimento;
    @Column(name = "valor_recebido", length = 10, nullable = false)
    private BigDecimal valorRecebido;
}
