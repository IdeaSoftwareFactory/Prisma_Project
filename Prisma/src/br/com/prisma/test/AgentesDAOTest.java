package br.com.prisma.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.prisma.dao.AgenteDAO;
import br.com.prisma.dao.ServicosDAO;
import br.com.prisma.domain.Agentes;
import br.com.prisma.domain.Servicos;

public class AgentesDAOTest {

	@Test
	@Ignore
	public void salvar() {
		ServicosDAO serviceDAO = new ServicosDAO();
		Servicos servicos = serviceDAO.BuscarPorCodigo(1L);

		Agentes agentes = new Agentes();
		agentes.setNome("AgenteTeste");
		agentes.setCNPJ("11111111111111");
		agentes.setEndereco("Rua A");
		agentes.setBairro("Loteamento");
		agentes.setCidade("Igarassu");
		agentes.setUF("PE");
		agentes.setNumero("1");
		agentes.setCEP("11111111");
		agentes.setFone("88888888");
		agentes.setEmail("teste@gmail.com");
		agentes.setResponsavel("Teste");
		agentes.setServicos(servicos);

		AgenteDAO DAO = new AgenteDAO();
		DAO.salvar(agentes);

	}

	@Test
	@Ignore
	public void BuscarPorCodigo() {
		AgenteDAO agentesDAO = new AgenteDAO();

		Agentes agentes = agentesDAO.BuscarPorCodigo(1L);

		System.out.println(agentes);
	}

	@Test
	@Ignore
	public void Listar() {
		AgenteDAO agentesDAO = new AgenteDAO();
		List<Agentes> agentes = agentesDAO.listar();
		System.out.println(agentes);
	}

	@Test
	@Ignore
	public void excluir() {
		AgenteDAO agentesDAO = new AgenteDAO();
		Agentes agentes = agentesDAO.BuscarPorCodigo(1L);
		agentesDAO.excluir(agentes);
	}

	@Test
	public void editar() {
		AgenteDAO agenteDAO = new AgenteDAO();
		Agentes agentes = agenteDAO.BuscarPorCodigo(2L);

		agentes.setNome("EditarTeste");
		agentes.setCNPJ("22222111111");

		ServicosDAO servicoDAO = new ServicosDAO();
		Servicos servicos = servicoDAO.BuscarPorCodigo(1L);
		agentes.setServicos(servicos);

		agenteDAO.editar(agentes);

	}
}
