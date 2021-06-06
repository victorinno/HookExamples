package com.aubay.exemplos;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;

import static org.junit.jupiter.api.Assertions.*;

class ExpeditorTelegramTest {

    ExpeditorTelegram expeditorTelegram = new ExpeditorTelegram();

    @Test
    void enviar() {
        Contato contato = new Contato();
        contato.setTelegram("teste");
        String mensagem = "test";
        String envio = expeditorTelegram.enviar(contato, mensagem);
        assertEquals(MessageFormat.format("'{'''tipo'': ''telegram'', ''contato'': ''{0}'', ''mensagem'':''{1}'''}'", contato.getTelegram(), mensagem),envio);
    }
}