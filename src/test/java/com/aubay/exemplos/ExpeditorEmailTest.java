package com.aubay.exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.MessageFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpeditorEmailTest {

    ExpeditorEmail expeditorEmail = new ExpeditorEmail();

    @Test
    public void enviar() {
        Contato contato = new Contato();
        contato.setEmail("teste@teste.com");
        String mensagem = "test";
        String envio = expeditorEmail.enviar(contato, mensagem);
        assertEquals(MessageFormat.format("'{'''tipo'': ''email'', ''contato'': ''{0}'', ''mensagem'':''{1}'''}'", contato.getEmail(), mensagem),envio);
    }

}