package br.com.prisma.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Agentes")
@NamedQueries({
	@NamedQuery(name = "Agentes.listar", query = "SELECT agentes FROM Agentes agentes"),
	@NamedQuery(name = "Agentes.BuscarCodigo", query = "SELECT agentes FROM Agentes agentes WHERE codigo = :codigo")})	

public class Agentes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Codigo_Agente")
	private Long codigo;
	@Column(name = "Nome_Agente", length = 45, nullable = false)
	private String nome;
	@Column(name = "CNPJ_Agente", length = 14, nullable = false)
	private String CNPJ;
	@Column(name = "Endereco_Agente", length = 45, nullable = false)
	private String endereco;
	@Column(name = "Bairro_Agente", length = 45, nullable = false)
	private String bairro;
	@Column(name = "Cidade_Agente", length = 45, nullable = false)
	private String cidade;
	@Column(name = "UF_Agente", length = 2, nullable = false)
	private String UF;
	@Column(name = "CEP_Agente", length = 8, nullable = false)
	private String CEP;
	@Column(name = "Numero_Agente", length = 10, nullable = false)
	private String numero;
	@Column(name = "Fone_Agente", length = 10, nullable = false)
	private String fone;
	@Column(name = "Email_Agente", length = 45, nullable = false)
	private String Email;
	@Column(name = "responsavel_Agente", length = 45, nullable = false)
	private String responsavel;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Angentes_Cod_Servicos", referencedColumnName = "Codigo_Servicos", nullable = false)
	private Servicos servicos;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Servicos getServicos() {
		return servicos;
	}

	public void setServicos(Servicos servicos) {
		this.servicos = servicos;
	}

}
