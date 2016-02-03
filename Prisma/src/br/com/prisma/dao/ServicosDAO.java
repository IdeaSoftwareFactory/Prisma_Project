package br.com.prisma.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import br.com.prisma.domain.Servicos;
import br.com.prisma.util.HibernateUtil;

public class ServicosDAO {
	public void salvar(Servicos servicos) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.save(servicos);
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
	public List<Servicos> Listar() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Servicos> servicos = null;

		try {
			Query consulta = sessao.getNamedQuery("Servicos.listar");
			servicos = consulta.list();

		} catch (RuntimeException ex) {

			throw ex;

		} finally {
			sessao.close();

		}

		return servicos;

	}
	
	public Servicos BuscarPorCodigo(Long Codigo) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Servicos servicos = null;

		try {
			Query consulta = sessao.getNamedQuery("Servicos.buscarCodigo");
			consulta.setLong("Codigo", Codigo);
			servicos = (Servicos) consulta.uniqueResult();

		} catch (RuntimeException ex) {

			throw ex;

		} finally {
			sessao.close();

		}

		return servicos;

	}
	
	public void Excluir (Servicos servicos) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.delete(servicos);
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
	
	public void Editar(Servicos servicos) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			Servicos ServicosEditar = BuscarPorCodigo(servicos.getCodigo());
			ServicosEditar.setDescricao(servicos.getDescricao());
			sessao.update(ServicosEditar);
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



}
