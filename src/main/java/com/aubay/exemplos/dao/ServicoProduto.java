package com.aubay.exemplos.dao;

import com.aubay.exemplos.entity.Produto;
import com.aubay.exemplos.gerador.GeradorArquivos;

public class ServicoProduto extends ServicoAbstrato<Produto>{
    private Dao<Produto> dao;

    public ServicoProduto(GeradorArquivos geradorArquivos) {
        super(geradorArquivos);
    }

    public Dao<Produto> getDao(){
        if(dao == null){
            dao = new ProdutoDao();
        }
        return dao;
    }

}
