package br.com.prisma.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.prisma.dao.UsuarioDAO;
import br.com.prisma.domain.Usuario;

public class UsuarioDAOTest {
	@Test
	public void salvar() {

		Usuario user = new Usuario();
		user.setNome("Descricao1");
		user.setSenha("teste");

		UsuarioDAO dao = new UsuarioDAO();
		dao.salvar(user);
	}

	@Test
	@Ignore
	public void listar() {

		UsuarioDAO dao = new UsuarioDAO();
		List<Usuario> usuarios = dao.Listar();

		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}

	}

	@Test
	@Ignore
	public void BuscarPorCodigo() {
		UsuarioDAO userTest = new UsuarioDAO();
		Usuario user1 = userTest.BuscarPorCodigo(4L);

		System.out.println(user1);
	}

	@Test
	@Ignore
	public void excluir() {

		UsuarioDAO user = new UsuarioDAO();
		Usuario usuario = user.BuscarPorCodigo(4L);
		user.Excluir(usuario);
	}
	@Test
	@Ignore
	public void Editar(){
		Usuario user = new Usuario();
		user.setCodigo(5L);
		user.setNome("DescricaoEditar");
		
		UsuarioDAO userDAO = new UsuarioDAO();
		userDAO.Editar(user);
	}
}
