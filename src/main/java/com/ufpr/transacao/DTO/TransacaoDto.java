package com.ufpr.transacao.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

public class TransacaoDto {
    @NotNull
    private Date data;
    @NotNull
    private double valorTransacao;
    @NotNull
    private UUID idCliente;
    @NotBlank
    private String tipoTransacao;
    @NotNull
    private UUID idClienteDestinatario;
    @NotNull
    private double saldo;
    private String color;
}
