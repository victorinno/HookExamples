package com.aubay.exemplos.gerador;

import com.aubay.exemplos.posprocessadores.NullPosProcessador;
import com.aubay.exemplos.posprocessadores.PosProcessador;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public abstract class GeradorArquivos {

    protected PosProcessador posProcessador = new NullPosProcessador();

    public void setPosProcessador(PosProcessador posProcessador) {
        this.posProcessador = posProcessador;
    }

    public final void gerarArquivos(String nome, Map<String, Object> propriedades) throws IOException {
        String conteudo = gerarConteudo(propriedades);
        byte[] dados = conteudo.getBytes(StandardCharsets.UTF_8);
        dados = posProcessador.processar(dados);
        FileOutputStream stream = new FileOutputStream(nome);
        stream.write(dados);
        stream.close();
    }

    protected abstract String gerarConteudo(Map<String, Object> propriedades);
}
