package br.com.gtech.pf.defaults;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements CrudRepositorio<Usuario, Integer> {
	
	private List<Usuario> bdUsuarios = new ArrayList<>();

	@Override
	public List<Usuario> buscarTodos() { 
		return this.bdUsuarios; //SELECT NO BANDO DE DADOS E RETORNAR TODOS OS REGISTROS
	}

	@Override
	public Usuario buscarPorId(Integer id) {
		return this.bdUsuarios.stream().filter(usuario -> usuario.getId().compareTo(id)==0).findFirst().get(); 
		//SELECT NO BANDO DE DADOS E RETORNAR O REGISTRO PELO ID
	}

	@Override
	public Usuario salvar(Usuario objeto) {
		this.bdUsuarios.add(objeto); 
		return objeto; //SALVAR NO BANDO DE DADOS
	}

}
