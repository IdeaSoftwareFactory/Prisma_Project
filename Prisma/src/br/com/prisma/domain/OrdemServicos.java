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
@Table(name = "OrdemServicos")
public class OrdemServicos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Codigo_OS")
	private Long codigo;
	@Column(name = "Descricao_OS", length = 45, nullable = false)
	private String descricao;
	@Column(name = "Status_OS", length = 1, nullable = false)
	private String status;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "OrdemServico_Cod_Agentes", referencedColumnName = "Codigo_Agente")
	private Agentes agentes;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "OrdemServicos_Cod_Clientes", referencedColumnName = "Codigo_Cliente")
	private Clientes clientes;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

}
