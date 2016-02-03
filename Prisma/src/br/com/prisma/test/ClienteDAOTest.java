package br.com.prisma.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import br.com.prisma.dao.ClienteDAO;
import br.com.prisma.domain.Clientes;

public class ClienteDAOTest {

	@Test
	public void salvar() {

		Clientes cliente = new Clientes();
		cliente.setNome("CLiente teste");
		cliente.setCNPJ("11111111111111");
		cliente.setEndereco("Rua A");
		cliente.setBairro("Loteamento");
		cliente.setCidade("Recife");
		cliente.setUF("PE");
		cliente.setCEP("5360000");
		cliente.setNumero("00");
		cliente.setFone("88888888");
		cliente.setEmail("teste@gmail.com");

		ClienteDAO dao = new ClienteDAO();
		dao.salvar(cliente);
	}

	@Test
	@Ignore
	public void listar() {

		ClienteDAO dao = new ClienteDAO();
		List<Clientes> cliente = dao.Listar();

		for (Clientes clientes : cliente) {
			System.out.println(clientes);
		}

	}

}
