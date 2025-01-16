package br.com.gtech.pf.defaults;

import java.util.List;

public interface CrudRepositorio<T, ID> {
	
	List<T>buscarTodos();
	
	T buscarPorId(ID id);
	
	T salvar(T objeto);
}
