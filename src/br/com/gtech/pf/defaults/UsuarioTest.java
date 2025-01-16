package br.com.gtech.pf.defaults;

import java.util.List;

public class UsuarioTest {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario(1, "Gilmar");
		Usuario usuario2 = new Usuario(2, "Diego");
		Usuario usuario3 = new Usuario(3, "Gomes");
		
		UsuarioService usuarioService = new UsuarioService();
		
		usuarioService.salvar(usuario);
		usuarioService.salvar(usuario2);
		usuarioService.salvar(usuario3);
		
		List<Usuario> listTodos = usuarioService.buscarTodos();
		System.out.println(listTodos);
		
		System.out.println(usuarioService.buscarPorId(2));
	}

}
