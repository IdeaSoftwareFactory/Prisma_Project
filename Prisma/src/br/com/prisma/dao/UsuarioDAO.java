package br.com.prisma.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.prisma.domain.Usuario;
import br.com.prisma.util.HibernateUtil;

public class UsuarioDAO {

	public void salvar(Usuario usuario) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.save(usuario);
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
	public List<Usuario> Listar() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Usuario> usuario = null;

		try {
			Query consulta = sessao.getNamedQuery("Usuario.listar");
			usuario = consulta.list();

		} catch (RuntimeException ex) {

			throw ex;

		} finally {
			sessao.close();

		}

		return usuario;

	}

	public Usuario BuscarPorCodigo(Long codigo) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Usuario usuario = null;

		try {
			Query consulta = sessao.getNamedQuery("Usuario.buscarCodigo");
			consulta.setLong("codigo", codigo);
			usuario = (Usuario) consulta.uniqueResult();

		} catch (RuntimeException ex) {

			throw ex;

		} finally {
			sessao.close();

		}

		return usuario;

	}
	
	public void Excluir (Usuario usuario) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.delete(usuario);
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
	
	public void Editar(Usuario usuario) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			Usuario UsuarioEditar = BuscarPorCodigo(usuario.getCodigo());
			UsuarioEditar.setNome(usuario.getNome());
			sessao.update(UsuarioEditar);
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
