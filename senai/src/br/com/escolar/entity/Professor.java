package br.com.escolar.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "professor")
public class Professor implements Serializable {

	private static final long serialVersionUID = 4653909158487970825L;
	
	private Long id;
	private Date cadastroProfessor = new Date();
	private String nomeProfessor;
	private String cursoProfessor;
	private String periodoProfessor;
	private String cpfProfessor;
	private String rgProfessor;
	private String enderecoProfessor;
	private String bairroProfessor;
	private String cidadeProfessor;
	private String ufProfessor;
	private Date nascimentoProfessor;
	private String foneProfessor;
	private String celularProfessor;
	private String emailProfessor;
	private String urlProfessor;

	public Professor(){
		
	}
	
	public Professor(long id, Date cadastroProfessor, String nomeProfessor, String cursoProfessor, String periodoProfessor, 
			String cpfProfessor, String rgProfessor, String enderecoProfessor, String bairroProfessor, String cidadeProfessor,
			String ufProfessor, Date nascimentoProfessor, String foneProfessor, String celularProfessor, String emailProfessor,
			String urlProfessor){
		super();
		this.id = id;
		this.cadastroProfessor = cadastroProfessor;
		this.nomeProfessor = nomeProfessor;
		this.cursoProfessor = cursoProfessor;
		this.periodoProfessor = periodoProfessor;
		this.cpfProfessor = cpfProfessor;
		this.rgProfessor = rgProfessor;
		this.enderecoProfessor = enderecoProfessor;
		this.bairroProfessor = bairroProfessor;
		this.cidadeProfessor = cidadeProfessor;
		this.ufProfessor = ufProfessor;
		this.nascimentoProfessor = nascimentoProfessor;
		this.foneProfessor = foneProfessor;
		this.celularProfessor = celularProfessor;
		this.emailProfessor = emailProfessor;
		this.urlProfessor = urlProfessor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCadastroProfessor() {
		return cadastroProfessor;
	}

	public void setCadastroProfessor(Date cadastroProfessor) {
		this.cadastroProfessor = cadastroProfessor;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getCursoProfessor() {
		return cursoProfessor;
	}

	public void setCursoProfessor(String cursoProfessor) {
		this.cursoProfessor = cursoProfessor;
	}

	public String getPeriodoProfessor() {
		return periodoProfessor;
	}

	public void setPeriodoProfessor(String periodoProfessor) {
		this.periodoProfessor = periodoProfessor;
	}

	@CPF
	public String getCpfProfessor() {
		return cpfProfessor;
	}

	public void setCpfProfessor(String cpfProfessor) {
		this.cpfProfessor = cpfProfessor;
	}

	public String getRgProfessor() {
		return rgProfessor;
	}

	public void setRgProfessor(String rgProfessor) {
		this.rgProfessor = rgProfessor;
	}

	public String getEnderecoProfessor() {
		return enderecoProfessor;
	}

	public void setEnderecoProfessor(String enderecoProfessor) {
		this.enderecoProfessor = enderecoProfessor;
	}

	public String getBairroProfessor() {
		return bairroProfessor;
	}

	public void setBairroProfessor(String bairroProfessor) {
		this.bairroProfessor = bairroProfessor;
	}

	public String getCidadeProfessor() {
		return cidadeProfessor;
	}

	public void setCidadeProfessor(String cidadeProfessor) {
		this.cidadeProfessor = cidadeProfessor;
	}

	public String getUfProfessor() {
		return ufProfessor;
	}

	public void setUfProfessor(String ufProfessor) {
		this.ufProfessor = ufProfessor;
	}

	public Date getNascimentoProfessor() {
		return nascimentoProfessor;
	}

	public void setNascimentoProfessor(Date nascimentoProfessor) {
		this.nascimentoProfessor = nascimentoProfessor;
	}

	public String getFoneProfessor() {
		return foneProfessor;
	}

	public void setFoneProfessor(String foneProfessor) {
		this.foneProfessor = foneProfessor;
	}

	public String getCelularProfessor() {
		return celularProfessor;
	}

	public void setCelularProfessor(String celularProfessor) {
		this.celularProfessor = celularProfessor;
	}

	@Email
	public String getEmailProfessor() {
		return emailProfessor;
	}

	public void setEmailProfessor(String emailProfessor) {
		this.emailProfessor = emailProfessor;
	}

	public String getUrlProfessor() {
		return urlProfessor;
	}

	public void setUrlProfessor(String urlProfessor) {
		this.urlProfessor = urlProfessor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
