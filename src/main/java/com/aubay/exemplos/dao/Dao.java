package com.aubay.exemplos.dao;

import com.aubay.exemplos.entity.Proprietarios;

import java.util.List;

public interface Dao<E extends Proprietarios> {
    public E recuperarPorId(Long id);
    public void salvar(E entidade);
    public void excluir(Object id);
    public List<E> listarTodos();
}
