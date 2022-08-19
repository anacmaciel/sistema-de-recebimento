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
    @Column(length = 10, nullable = false)
    private BigDecimal valorAReceber;
@Column(length = 10, nullable = false)
    private BigDecimal descontoRecebimento;
@Column(length = 10, nullable = false)
    private BigDecimal valorRecebido;
}
