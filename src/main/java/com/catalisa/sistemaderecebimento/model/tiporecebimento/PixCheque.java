package com.catalisa.sistemaderecebimento.model.tiporecebimento;

import com.catalisa.sistemaderecebimento.model.RecebimentoModel;

import java.math.BigDecimal;

public class PixCheque implements CalculoRecebimento{
    @Override
    public BigDecimal calculoRecebimento(RecebimentoModel recebimentoModel) {
        return recebimentoModel.getValorAReceber();
    }
}
