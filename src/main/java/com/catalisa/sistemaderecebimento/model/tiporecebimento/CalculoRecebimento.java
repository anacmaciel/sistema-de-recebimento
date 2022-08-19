package com.catalisa.sistemaderecebimento.model.tiporecebimento;

import com.catalisa.sistemaderecebimento.model.RecebimentoModel;

import java.math.BigDecimal;

public interface CalculoRecebimento {
BigDecimal calculoRecebimento(RecebimentoModel recebimentoModel);
}
