package br.com.prisma.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Servicos")
public class Servicos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Codigo_Servicos")
	private Long Codigo;
	@Column(name = "Descricao_Servicos", length = 45, nullable = false)
	private String Descricao;

	public Long getCodigo() {
		return Codigo;
	}

	public void setCodigo(Long codigo) {
		Codigo = codigo;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

}
