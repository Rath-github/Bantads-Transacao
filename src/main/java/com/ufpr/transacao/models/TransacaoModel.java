package com.ufpr.transacao.models;

import jakarta.persistence.*;
import lombok.Data;

import org.hibernate.annotations.GenericGenerator;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "TRANSACAO")
@Data
public class TransacaoModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(unique = true, updatable = false, nullable = false)
    private UUID id;

    @Column(nullable = false)
    private Date data;

    @Column(nullable = false)
    private double valorTransacao;

    @Column(nullable = false)
    private UUID idCliente;

    @Column(nullable = false)
    private String tipoTransacao;

    @Column(nullable = false)
    private UUID idClienteDestinatario;

    @Column(nullable = false)
    private double saldo;

    @Column
    private String color;
}
