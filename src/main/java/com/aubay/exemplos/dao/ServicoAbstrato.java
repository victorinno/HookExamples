package com.aubay.exemplos.dao;

import com.aubay.exemplos.entity.Proprietarios;
import com.aubay.exemplos.gerador.GeradorArquivos;

import java.io.IOException;

public abstract class ServicoAbstrato<E extends Proprietarios> {

    public GeradorArquivos geradorArquivos;

    public ServicoAbstrato(GeradorArquivos geradorArquivos) {
        this.geradorArquivos = geradorArquivos;
    }

    public abstract Dao<E> getDao();

    public void gravarEntidadeEmArquivo(Long id, String nomeArquivo) throws IOException {
        E entidade = getDao().recuperarPorId(id);
        geradorArquivos.gerarArquivos(nomeArquivo,
                entidade.getProperiedades());
    }
}
