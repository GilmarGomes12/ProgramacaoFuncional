package br.com.gtech.pf.defaults;

import java.util.List;

public interface CrudServiceGeneric<T, ID> {

	default List<T> buscarTodos(){
		return getCrudRepositorio().buscarTodos();
    }

	default T buscarPorId(ID id) {
        return getCrudRepositorio().buscarPorId(id);
    }

	default T salvar(T objeto) {
        return getCrudRepositorio().salvar(objeto);
    }
	
	CrudRepositorio<T, ID> getCrudRepositorio();
}
