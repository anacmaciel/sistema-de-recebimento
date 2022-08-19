package com.catalisa.sistemaderecebimento.model.tiporecebimento;

public class RecebimentoFactory {
    public CalculoRecebimento calculoRecebimento(String tipoRecebimento) {
        if (tipoRecebimento.equalsIgnoreCase("cartao_de_credito")) {
            return new CartaoDeCredito();
        } else if (tipoRecebimento.equalsIgnoreCase("cartao_de_debito") {
            return new CartaoDeDebito();
        } else if (tipoRecebimento.equalsIgnoreCase("vale_refeicao")) {
            return new ValeRefeicao();
        } else if (tipoRecebimento.equalsIgnoreCase("pix_cheque")) {
            return new PixCheque();
        } else {
            return null;
        }
    }
}
