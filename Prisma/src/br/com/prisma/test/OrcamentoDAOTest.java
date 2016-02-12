package br.com.prisma.test;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.prisma.dao.AgenteDAO;
import br.com.prisma.dao.ClienteDAO;
import br.com.prisma.dao.OrcamentoDAO;
import br.com.prisma.dao.ServicosDAO;
import br.com.prisma.domain.Agentes;
import br.com.prisma.domain.Clientes;
import br.com.prisma.domain.Orcamento;
import br.com.prisma.domain.Servicos;

public class OrcamentoDAOTest {

	@Test
	@Ignore
	public void salvar() {

		AgenteDAO agenteDAO = new AgenteDAO();
		Agentes agentes = agenteDAO.BuscarPorCodigo(2L);

		ClienteDAO clienteDAO = new ClienteDAO();
		Clientes clientes = clienteDAO.BuscarPorCodigo(1L);

		ServicosDAO serviceDAO = new ServicosDAO();
		Servicos servicos = serviceDAO.BuscarPorCodigo(1L);

		Orcamento orcamento = new Orcamento();
		orcamento.setDescricao("OrcamentoTeste");
		orcamento.setValorUnitario(new BigDecimal(12.30D));
		orcamento.setValorTotal(new BigDecimal(10.30D));
		orcamento.setObservacoes("Orcamento teste");
		orcamento.setAgentes(agentes);
		orcamento.setClientes(clientes);
		orcamento.setServicos(servicos);

		OrcamentoDAO orcamentoDAO = new OrcamentoDAO();
		orcamentoDAO.salvar(orcamento);

	}

	@Test
	@Ignore
	public void Listar() {
		OrcamentoDAO DAO = new OrcamentoDAO();
		List<Orcamento> orcamento = DAO.listar();
		System.out.println(orcamento);
	}

	@Test
	public void BuscarPorCodigo() {
		OrcamentoDAO orcamentoDAO = new OrcamentoDAO();

		Orcamento orcamento = orcamentoDAO.BuscarPorCodigo(1L);

		System.out.println(orcamento);
	}

}
