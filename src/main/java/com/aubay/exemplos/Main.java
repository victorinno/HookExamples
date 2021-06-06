package com.aubay.exemplos;

import com.aubay.exemplos.dao.ServicoProduto;
import com.aubay.exemplos.entity.Produto;
import com.aubay.exemplos.gerador.GeradorPropriedades;
import com.aubay.exemplos.gerador.GeradorXml;
import com.aubay.exemplos.posprocessadores.CompatadorPosProcessor;
import com.aubay.exemplos.posprocessadores.CriptoPosProcessador;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        long id = 1l;
        GeradorXml geradorXml = new GeradorXml();
//        geradorXmlcompactados.setPosProcessador(new CompatadorPosProcessor());
        ServicoProduto servicoProdutoXml = new ServicoProduto(geradorXml);
        servicoProdutoXml.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProdutoXml.gravarEntidadeEmArquivo(id, "testXml.xml");

        GeradorXml geradorXmlCompactado = new GeradorXml();
        geradorXmlCompactado.setPosProcessador(new CompatadorPosProcessor());
        ServicoProduto servicoProdutoXmlCompactado = new ServicoProduto(geradorXmlCompactado);
        servicoProdutoXmlCompactado.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProdutoXmlCompactado.gravarEntidadeEmArquivo(id, "testXml.zip");

        GeradorXml geradorXmlCriptografado = new GeradorXml();
        geradorXmlCriptografado.setPosProcessador(new CompatadorPosProcessor());
        ServicoProduto servicoProdutoXmlCriptografado = new ServicoProduto(geradorXmlCriptografado);
        servicoProdutoXmlCriptografado.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProdutoXmlCriptografado.gravarEntidadeEmArquivo(id, "testXml");

        GeradorPropriedades geradorPropriedades = new GeradorPropriedades();
        ServicoProduto servicoProduto = new ServicoProduto(geradorPropriedades);
        servicoProduto.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProduto.gravarEntidadeEmArquivo(id, "testProp.properties");

        GeradorPropriedades geradorPropriedadesCompactado = new GeradorPropriedades();
        geradorPropriedadesCompactado.setPosProcessador(new CompatadorPosProcessor());
        ServicoProduto servicoProdutoCompactado = new ServicoProduto(geradorPropriedadesCompactado);
        servicoProdutoCompactado.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProdutoCompactado.gravarEntidadeEmArquivo(id, "testProp.zip");

        GeradorPropriedades geradorPropriedadesCripto = new GeradorPropriedades();
        geradorPropriedadesCripto.setPosProcessador(new CriptoPosProcessador(100));
        ServicoProduto servicoProdutoCrip = new ServicoProduto(geradorPropriedadesCripto);
        servicoProdutoCrip.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProdutoCrip.gravarEntidadeEmArquivo(id, "testProp");

    }

}
