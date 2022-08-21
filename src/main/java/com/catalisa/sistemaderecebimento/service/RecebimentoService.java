package com.catalisa.sistemaderecebimento.service;

import com.catalisa.sistemaderecebimento.model.RecebimentoModel;
import com.catalisa.sistemaderecebimento.model.tiporecebimento.RecebimentoFactory;
import com.catalisa.sistemaderecebimento.repository.RecebimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class RecebimentoService {

    @Autowired
    private RecebimentoRepository recebimentoRepository;

    public List<RecebimentoModel> buscartodos() {
        return recebimentoRepository.findAll();
    }

    public Optional<RecebimentoModel> buscarPorIndice(Long indice) {
        return recebimentoRepository.findById(indice);
    }

    public RecebimentoModel registrar(RecebimentoModel recebimentoModel) {
        RecebimentoFactory recebimentoFactory = new RecebimentoFactory();
        BigDecimal valor = recebimentoFactory.calculoRecebimento(recebimentoModel.getFormaDeRecebimento()).calculoRecebimento(recebimentoModel);
        BigDecimal desconto = recebimentoModel.getValorAReceber().subtract(valor);
        recebimentoModel.getIndice();
        recebimentoModel.getFormaDeRecebimento();
        recebimentoModel.getValorAReceber();
        recebimentoModel.setDescontoRecebimento(desconto);
        recebimentoModel.setValorRecebido(valor);
        return recebimentoRepository.save(recebimentoModel);
    }


    public RecebimentoModel alterar(RecebimentoModel recebimentoModel) {
        RecebimentoFactory recebimentoFactory = new RecebimentoFactory();
        BigDecimal valor = recebimentoFactory.calculoRecebimento(recebimentoModel.getFormaDeRecebimento()).calculoRecebimento(recebimentoModel);
        BigDecimal desconto = recebimentoModel.getValorAReceber().subtract(valor);
        recebimentoModel.getIndice();
        recebimentoModel.getFormaDeRecebimento();
        recebimentoModel.getValorAReceber();
        recebimentoModel.setDescontoRecebimento(desconto);
        recebimentoModel.setValorRecebido(valor);
        return recebimentoRepository.save(recebimentoModel);
    }

    public void deletar(Long indice) {
        recebimentoRepository.deleteById(indice);
    }
}
