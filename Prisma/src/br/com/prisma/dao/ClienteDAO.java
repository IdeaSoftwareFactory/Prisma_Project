package br.com.prisma.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.prisma.domain.Clientes;

import br.com.prisma.util.HibernateUtil;

public class ClienteDAO {

	public void salvar(Clientes clientes) {
		// capturando uma sessão
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.save(clientes);
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
	public List<Clientes> Listar() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Clientes> cliente = null;

		try {
			Query consulta = sessao.getNamedQuery("Cliente.listar");
			cliente = consulta.list();

		} catch (RuntimeException ex) {

			throw ex;

		} finally {
			sessao.close();

		}

		return cliente;

	}

}
