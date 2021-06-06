package com.aubay.exemplos;

import java.io.Serializable;
import java.text.MessageFormat;

public abstract class Expeditor<C extends Serializable> {
    public String enviar(Contato contato, String mensagem) {
        C destinatario = getContato(contato);
        return MessageFormat.format("'{'''tipo'': ''" + getTipo() + "'', ''contato'': ''{0}'', ''mensagem'':''{1}'''}'", destinatario, mensagem);
    }

    protected abstract String getTipo();

    protected abstract C getContato(Contato contato);
}
