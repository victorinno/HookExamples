package com.aubay.exemplos.gerador;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeradorPropriedadesCriptografado extends GeradorArquivos{

    private int delay;

    public GeradorPropriedadesCriptografado(int delay) {
        this.delay = delay;
    }

    protected byte[] processar(byte[] bytes) throws IOException {
        byte[] newBytes = new byte[bytes.length];
        IntStream.range(0, bytes.length).forEach(i -> newBytes[i] = (byte) ((bytes[i] + delay) % Byte.MAX_VALUE));
        return newBytes;
    }

    protected String gerarConteudo(Map<String, Object> props) {
        return props.keySet().stream()
                .map(prop -> MessageFormat.format("{0}={1}\n", prop, props.get(prop)))
                .collect(Collectors.joining());
    }
}
