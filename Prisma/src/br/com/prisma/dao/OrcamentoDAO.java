package br.com.prisma.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import br.com.prisma.domain.Orcamento;
import br.com.prisma.util.HibernateUtil;

public class OrcamentoDAO {

	public void salvar(Orcamento orcamento) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.save(orcamento);
			transacao.commit();

		} catch (RuntimeException ex) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw ex;
		} finally {
			sessao.close();
		}

	}

	@SuppressWarnings("unchecked")
	public List<Orcamento> listar() {

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Orcamento> orcamentos = null;

		try {
			Query consulta = sessao.getNamedQuery("Orcamento.listar");
			orcamentos = consulta.list();

		} catch (RuntimeException ex) {
			throw ex;
		} finally {
			sessao.close();
		}
		return orcamentos;

	}

	public Orcamento BuscarPorCodigo(Long codigo) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Orcamento orcamento = null;

		try {
			Query consulta = sessao.getNamedQuery("Orcamento.BuscarCodigo");
			consulta.setLong("codigo", codigo);

			orcamento = (Orcamento) consulta.uniqueResult();

		} catch (RuntimeException ex) {
			throw ex;
		} finally {
			sessao.close();
		}
		return orcamento;

	}

}
