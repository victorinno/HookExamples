package com.aubay.exemplos.gerador;

import java.text.MessageFormat;
import java.util.Map;
import java.util.stream.Collectors;

public class GeradorPropriedades extends GeradorArquivos {

    protected String gerarConteudo(Map<String, Object> props) {
        return props.keySet().stream()
                .map(prop -> MessageFormat.format("{0}={1}\n", prop, props.get(prop)))
                .collect(Collectors.joining());
    }
}
