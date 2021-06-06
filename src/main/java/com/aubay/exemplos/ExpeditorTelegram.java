package com.aubay.exemplos;

import java.text.MessageFormat;

public class ExpeditorTelegram extends Expeditor<String>{

    @Override
    protected String getTipo() {
        return "telegram";
    }

    @Override
    protected String getContato(Contato contato) {
        return contato.getTelegram();
    }

}
