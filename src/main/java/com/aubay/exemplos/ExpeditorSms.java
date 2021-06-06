package com.aubay.exemplos;

import java.text.MessageFormat;

public class ExpeditorSms extends Expeditor<Long>{

    @Override
    protected String getTipo() {
        return "sms";
    }

    @Override
    protected Long getContato(Contato contato) {
        return contato.getNumero();
    }
}
