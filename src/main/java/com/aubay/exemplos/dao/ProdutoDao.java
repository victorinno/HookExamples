package com.aubay.exemplos.dao;

import com.aubay.exemplos.entity.Produto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoDao implements Dao<Produto> {

    private Map<Object, Produto> db = new HashMap<>();

    @Override
    public Produto recuperarPorId(Long id) {
        return db.get(id);
    }

    @Override
    public void salvar(Produto entidade) {
        db.put(entidade.getId(), entidade);
    }

    @Override
    public void excluir(Object id) {
        db.remove(id);
    }

    @Override
    public List<Produto> listarTodos() {
        return (List<Produto>) db.values();
    }
}
