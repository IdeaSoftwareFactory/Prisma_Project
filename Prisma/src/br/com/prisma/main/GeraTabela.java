package br.com.prisma.main;

import br.com.prisma.util.HibernateUtil;

public class GeraTabela {

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory();

		HibernateUtil.getSessionFactory().close();
	}

}
