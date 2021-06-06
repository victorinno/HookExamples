package com.aubay.exemplos.gerador;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public abstract class GeradorArquivos {

    public final void gerarArquivos(String nome, Map<String, Object> propriedades) throws IOException {
        String conteudo = gerarConteudo(propriedades);
        byte[] dados = conteudo.getBytes(StandardCharsets.UTF_8);
        dados = processar(dados);
        FileOutputStream stream = new FileOutputStream(nome);
        stream.write(dados);
        stream.close();
    }

    protected byte[] processar(byte[] dados) throws IOException {
        return dados;
    }

    protected abstract String gerarConteudo(Map<String, Object> propriedades);
}
