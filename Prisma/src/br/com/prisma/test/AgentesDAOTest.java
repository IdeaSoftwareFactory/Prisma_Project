package br.com.prisma.test;

import org.junit.Test;

import br.com.prisma.dao.AgenteDAO;
import br.com.prisma.dao.ServicosDAO;
import br.com.prisma.domain.Agentes;
import br.com.prisma.domain.Servicos;

public class AgentesDAOTest {

	@Test
	public void inserir() {
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
		DAO.inserir(agentes);

	}

}
