package com.aubay.exemplos;

import java.text.MessageFormat;

public class ExpeditorEmail {
    public String enviar(Contato contato, String mensagem){
        String email = contato.getEmail();
        return MessageFormat.format("'{'''tipo'': ''email'', ''contato'': ''{0}'', ''mensagem'':''{1}'''}'", email, mensagem);
    }
}
