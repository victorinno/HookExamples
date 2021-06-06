package com.aubay.exemplos;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;

import static org.junit.jupiter.api.Assertions.*;

class ExpeditorSmsTest {

    ExpeditorSms expeditorSms = new ExpeditorSms();

    @Test
    void enviar() {
        Contato contato = new Contato();
        contato.setNumero(123L);
        String mensagem = "test";
        String envio = expeditorSms.enviar(contato, mensagem);
        assertEquals(MessageFormat.format("'{'''tipo'': ''sms'', ''contato'': ''{0}'', ''mensagem'':''{1}'''}'", contato.getNumero(), mensagem),envio);
    }
}