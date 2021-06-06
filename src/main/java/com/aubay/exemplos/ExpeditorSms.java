package com.aubay.exemplos;

import java.text.MessageFormat;

public class ExpeditorSms {

    public String enviar(Contato contato, String mensagem){
        Long number = contato.getNumero();
        return MessageFormat.format("'{'''tipo'': ''sms'', ''contato'': ''{0}'', ''mensagem'':''{1}'''}'", number, mensagem);
    }
}
