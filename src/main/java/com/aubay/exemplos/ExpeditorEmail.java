package com.aubay.exemplos;

import java.text.MessageFormat;

public class ExpeditorEmail extends Expeditor<String> {

    @Override
    protected String getTipo() {
        return "email";
    }

    @Override
    protected String getContato(Contato contato) {
        return contato.getEmail();
    }
}
