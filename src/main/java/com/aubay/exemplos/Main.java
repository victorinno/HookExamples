package com.aubay.exemplos;

import com.aubay.exemplos.dao.ServicoProduto;
import com.aubay.exemplos.entity.Produto;
import com.aubay.exemplos.gerador.GeradorPropriedadesCriptografado;
import com.aubay.exemplos.gerador.GeradorXmlcompactados;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        long id = 1l;
        ServicoProduto servicoProdutoXml = new ServicoProduto(new GeradorXmlcompactados());
        servicoProdutoXml.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProdutoXml.gravarEntidadeEmArquivo(id, "testXml.zip");

        ServicoProduto servicoProdutoCrip = new ServicoProduto(new GeradorPropriedadesCriptografado(100));
        servicoProdutoCrip.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProdutoCrip.gravarEntidadeEmArquivo(id, "testCrip.txt");

    }

}
