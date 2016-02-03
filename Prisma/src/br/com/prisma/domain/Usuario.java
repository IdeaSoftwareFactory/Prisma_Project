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
@Table(name = "Usuarios")
@NamedQueries({
		@NamedQuery(name = "Usuario.listar", query = "SELECT usuario FROM Usuario usuario"),
		@NamedQuery(name = "Usuario.buscarCodigo", query = "SELECT usuario FROM Usuario usuario where usuario.codigo = :codigo") })
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Cod_Usuarios", length = 45, nullable = false)
	private Long codigo;
	@Column(name = "Nome_Usuarios")
	private String nome;
	@Column(name = "Senha_Usuarios")
	private String senha;

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nome=" + nome + ", senha="
				+ senha + "]";
	}

}
