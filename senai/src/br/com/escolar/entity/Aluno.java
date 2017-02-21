package br.com.escolar.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "aluno")
public class Aluno implements Serializable {

	private static final long serialVersionUID = -8906789612595159367L;
	
	private Long id;
	private Date cadastroAluno = new Date();
	private String nomeAluno;
	private String cursoAluno;
	private String periodoAluno;
	private String cpfAluno;
	private String rgAluno;
	private String enderecoAluno;
	private String bairroAluno;
	private String cidadeAluno;
	private String ufAluno;
	private Date nascimentoAluno;
	private String foneAluno;
	private String celularAluno;
	private String emailAluno;
	private String urlAluno;

	public Aluno() {
	}

	public Aluno(Long id, Date cadastroAluno, String nomeAluno, String cursoAluno, String periodoAluno, String cpfAluno,
			String rgAluno, String enderecoAluno, String bairroAluno, String cidadeAluno, String ufAluno,
			Date nascimentoAluno, String foneAluno, String celularAluno, String emailAluno, String urlAluno) {
		super();
		this.id = id;
		this.cadastroAluno = cadastroAluno;
		this.nomeAluno = nomeAluno;
		this.cursoAluno = cursoAluno;
		this.periodoAluno = periodoAluno;
		this.cpfAluno = cpfAluno;
		this.rgAluno = rgAluno;
		this.enderecoAluno = enderecoAluno;
		this.bairroAluno = bairroAluno;
		this.cidadeAluno = cidadeAluno;
		this.ufAluno = ufAluno;
		this.nascimentoAluno = nascimentoAluno;
		this.foneAluno = foneAluno;
		this.celularAluno = celularAluno;
		this.emailAluno = emailAluno;
		this.urlAluno = urlAluno;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	public Date getCadastroAluno() {
		return cadastroAluno;
	}

	public void setCadastroAluno(Date cadastroAluno) {
		this.cadastroAluno = cadastroAluno;
	}

	@Column(length = 120, nullable = false)
	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	@Column(length = 60, nullable = false)
	public String getCursoAluno() {
		return cursoAluno;
	}

	public void setCursoAluno(String cursoAluno) {
		this.cursoAluno = cursoAluno;
	}

	@Column(length = 60, nullable = false)
	public String getPeriodoAluno() {
		return periodoAluno;
	}

	public void setPeriodoAluno(String periodoAluno) {
		this.periodoAluno = periodoAluno;
	}

	@CPF
	@Column(length = 18)
	public String getCpfAluno() {
		return cpfAluno;
	}

	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	@Column(length = 18)
	public String getRgAluno() {
		return rgAluno;
	}

	public void setRgAluno(String rgAluno) {
		this.rgAluno = rgAluno;
	}

	@Column(length = 255)
	public String getEnderecoAluno() {
		return enderecoAluno;
	}

	public void setEnderecoAluno(String enderecoAluno) {
		this.enderecoAluno = enderecoAluno;
	}

	@Column(length = 80)
	public String getBairroAluno() {
		return bairroAluno;
	}

	public void setBairroAluno(String bairroAluno) {
		this.bairroAluno = bairroAluno;
	}

	@Column(length = 80)
	public String getCidadeAluno() {
		return cidadeAluno;
	}

	public void setCidadeAluno(String cidadeAluno) {
		this.cidadeAluno = cidadeAluno;
	}

	@Column(length = 2)
	public String getUfAluno() {
		return ufAluno;
	}

	public void setUfAluno(String ufAluno) {
		this.ufAluno = ufAluno;
	}

	@Temporal(TemporalType.DATE)
	public Date getNascimentoAluno() {
		return nascimentoAluno;
	}

	public void setNascimentoAluno(Date nascimentoAluno) {
		this.nascimentoAluno = nascimentoAluno;
	}

	@Column(length = 18)
	public String getFoneAluno() {
		return foneAluno;
	}

	public void setFoneAluno(String foneAluno) {
		this.foneAluno = foneAluno;
	}

	@Column(length = 18)
	public String getCelularAluno() {
		return celularAluno;
	}

	public void setCelularAluno(String celularAluno) {
		this.celularAluno = celularAluno;
	}

	@Email
	@Column(length = 120)
	public String getEmailAluno() {
		return emailAluno;
	}

	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}

	@Column(length = 120)
	public String getUrlAluno() {
		return urlAluno;
	}

	public void setUrlAluno(String urlAluno) {
		this.urlAluno = urlAluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", cadastroAluno=" + cadastroAluno + ", nomeAluno=" + nomeAluno + ", cursoAluno="
				+ cursoAluno + ", periodoAluno=" + periodoAluno + ", cpfAluno=" + cpfAluno + ", rgAluno=" + rgAluno
				+ ", enderecoAluno=" + enderecoAluno + ", bairroAluno=" + bairroAluno + ", cidadeAluno=" + cidadeAluno
				+ ", ufAluno=" + ufAluno + ", nascimentoAluno=" + nascimentoAluno + ", foneAluno=" + foneAluno
				+ ", celularAluno=" + celularAluno + ", emailAluno=" + emailAluno + ", urlAluno=" + urlAluno + "]";
	}

}
