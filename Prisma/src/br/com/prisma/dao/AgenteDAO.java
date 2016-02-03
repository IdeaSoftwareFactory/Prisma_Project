package br.com.prisma.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.prisma.domain.Agentes;
import br.com.prisma.util.HibernateUtil;

public class AgenteDAO {

	public void inserir(Agentes agentes) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		
		try{
			transacao = sessao.beginTransaction();
			sessao.save(agentes);
			transacao.commit();
			
			
		}catch(RuntimeException ex){
			if(transacao != null){
				transacao.rollback();
			}
			throw ex;
		}finally{
			sessao.close();
		}

	}

}
