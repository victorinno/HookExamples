package com.aubay.exemplos;

import java.text.MessageFormat;

public class ExpeditorTelegram {
    public String enviar(Contato contato, String mensagem){
        String telegram = contato.getTelegram();
        return MessageFormat.format("'{'''tipo'': ''telegram'', ''contato'': ''{0}'', ''mensagem'':''{1}'''}'", telegram, mensagem);
    }

}
