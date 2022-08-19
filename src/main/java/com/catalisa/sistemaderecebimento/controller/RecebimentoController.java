package com.catalisa.sistemaderecebimento.controller;

import com.catalisa.sistemaderecebimento.model.RecebimentoModel;
import com.catalisa.sistemaderecebimento.service.RecebimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RecebimentoController {
@Autowired
    private RecebimentoService recebimentoService;

@GetMapping(path = "/recebimento")
    public List<RecebimentoModel> buscarTodosRecebimentos() {
    return recebimentoService.buscartodos();
}

@GetMapping(path = "/recebimento/{codigo}")
public Optional<RecebimentoModel> buscarEspecifico(@PathVariable Long indice) {
    return recebimentoService.buscarPorIndice(indice);
}

@PostMapping(path = "/recebimento")
    @ResponseStatus(HttpStatus.CREATED)
    public RecebimentoModel registrarRecebimento(@RequestBody RecebimentoModel recebimentoModel) {
    return recebimentoService.registrar(recebimentoModel);
}

@PutMapping(path = "/recebimento/{indice}")
    public RecebimentoModel alterarRecebimento(@RequestBody RecebimentoModel recebimentoModel) {
    return recebimentoService.alterar(recebimentoModel);
}
@DeleteMapping(path = "/recebimento/{indice}")
    public void  deletarRecebimento(@PathVariable Long indice) {
    recebimentoService.deletar(indice);
}
}
