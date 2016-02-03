package br.com.prisma.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Avaliacao")
public class Avaliacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Codigo_Avaliacao")
	private Long codigo;
	@Column(name = "Qualificacao_Avaliacao", length = 10, nullable = false)
	private String Qualificacao;
	@Column(name = "Observacoes_Avaliacao", length = 45, nullable = false)
	private String Observacoes;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Avaliacao_Cod_OrdemServicos", referencedColumnName = "Codigo_OS")
	private OrdemServicos ordemServicos;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getQualificacao() {
		return Qualificacao;
	}

	public void setQualificacao(String qualificacao) {
		Qualificacao = qualificacao;
	}

	public String getObservacoes() {
		return Observacoes;
	}

	public void setObservacoes(String observacoes) {
		Observacoes = observacoes;
	}

	public OrdemServicos getOrdemServicos() {
		return ordemServicos;
	}

	public void setOrdemServicos(OrdemServicos ordemServicos) {
		this.ordemServicos = ordemServicos;
	}

}
