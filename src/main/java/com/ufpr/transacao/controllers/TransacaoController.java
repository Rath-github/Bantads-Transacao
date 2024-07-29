package com.ufpr.transacao.controllers;

import com.ufpr.transacao.services.TransacaoService;

@RestContoller
@CrossOrigin
@RequestMapping
public class TransacaoController {
    final TransacaoService transacaoService;

    public TransacaoController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }
    @PostMapping
    public ResponseEntity<Object> saveTransacao(@RequestBody){

    }

}
