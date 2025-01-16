package br.com.gtech.pf.defaults;

public class UsuarioService implements CrudServiceGeneric<Usuario, Integer> {
	
	private UsuarioDAO usuarioDAO = new UsuarioDAO();

	@Override
	public CrudRepositorio<Usuario, Integer> getCrudRepositorio() {
		return this.usuarioDAO;
	}
	
}
