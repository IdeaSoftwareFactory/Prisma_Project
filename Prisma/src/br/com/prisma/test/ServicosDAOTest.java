package br.com.prisma.test;

import org.junit.Ignore;
import org.junit.Test;

import br.com.prisma.dao.ServicosDAO;
import br.com.prisma.domain.Servicos;

public class ServicosDAOTest {
	@Test
	@Ignore
	public void salvar() {

		Servicos servicos = new Servicos();
		servicos.setDescricao("Teste");

		ServicosDAO dao = new ServicosDAO();
		dao.salvar(servicos);
		;
	}

}
