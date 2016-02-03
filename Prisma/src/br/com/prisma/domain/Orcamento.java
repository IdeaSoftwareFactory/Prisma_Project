package br.com.prisma.domain;

import java.math.BigDecimal;

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
@Table(name = "Orcamento")
public class Orcamento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Codigo_Orcamento")
	private Long codigo;
	@Column(name = "Descricao_Orcamento", length = 45, nullable = false)
	private String descricao;
	@Column(name = "ValorUnitario_Orcamento", precision = 7, scale = 2, nullable = false)
	private BigDecimal valorUnitario;
	@Column(name = "ValorTotal_Orcamento", precision = 7, scale = 2, nullable = false)
	private BigDecimal valorTotal;
	@Column(name = "Observacoes_Orcamento", length = 45, nullable = false)
	private String observacoes;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Orcamento_Cod_Agente", referencedColumnName = "Codigo_Agente", nullable = false)
	private Agentes agentes;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Orcamento_Cod_Clientes", referencedColumnName = "Codigo_Cliente", nullable = false)
	private Clientes clientes;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Orcamento_Cod_Servicos", referencedColumnName = "Codigo_Servicos", nullable = false)
	private Servicos servicos;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Agentes getAgentes() {
		return agentes;
	}

	public void setAgentes(Agentes agentes) {
		this.agentes = agentes;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	public Servicos getServicos() {
		return servicos;
	}

	public void setServicos(Servicos servicos) {
		this.servicos = servicos;
	}

}
