package br.com.prisma.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name = "Clientes")
@NamedQueries({
	@NamedQuery(name = "Cliente.listar", query = "SELECT cliente FROM Clientes clientes"),
	@NamedQuery(name = "Cliente.buscarCodigo", query = "SELECT cliente FROM Clientes clientes where clientes.codigo = :codigo") })
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Codigo_Cliente", length = 45, nullable = false)
	private Long codigo;
	@Column(name = "Nome_Cliente", length = 45, nullable = false)
	private String nome;
	@Column(name = "CNPJ_Cliente", length = 14, nullable = false)
	private String CNPJ;
	@Column(name = "Endereco_Cliente", length = 45, nullable = false)
	private String endereco;
	@Column(name = "Bairro_Cliente", length = 45, nullable = false)
	private String bairro;
	@Column(name = "Cidade_Cliente", length = 45, nullable = false)
	private String cidade;
	@Column(name = "UF_Cliente", length = 2, nullable = false)
	private String UF;
	@Column(name = "CEP_Cliente", length = 8, nullable = false)
	private String CEP;
	@Column(name = "Numero_Cliente", length = 10, nullable = false)
	private String numero;
	@Column(name = "Fone_Cliente", length = 10, nullable = false)
	private String fone;
	@Column(name = "Email_Cliente", length = 45, nullable = false)
	private String email;

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
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Clientes [codigo=" + codigo + ", nome=" + nome + ", CNPJ="
				+ CNPJ + ", endereco=" + endereco + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", UF=" + UF + ", CEP=" + CEP
				+ ", numero=" + numero + ", fone=" + fone + ", email=" + email
				+ "]";
	}
	
	

}
