package br.com.escolar.control;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.escolar.entity.Professor;

@ManagedBean
@SessionScoped
public class ProfessorMBean {

	private Professor professor;
	private ProfessorMBean pd;
	private List<Professor> professorList;
	
	@PostConstruct
	public void init(){
		this.professor = new Professor();
		this.pd = new ProfessorMBean();
		this.professorList = pd.list();
		
	}

	public String newProfessor(){
		return "manageProfessor";
	}
	
	public String deleteProfessor(Professor professor){
		pd.deleteProfessor(professor);
		return "professor";
	}
	
	public String editProfessor(Professor professor){
		this.professor = professor;
		return "manageProfessor";
	}
	
	public String save(){
		pd.saveOrUpdate(professor);
		this.professor = new Professor();
		return "professor";
	}
	
	
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public ProfessorMBean getPd() {
		return pd;
	}

	public void setPd(ProfessorMBean pd) {
		this.pd = pd;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((professorList == null) ? 0 : professorList.hashCode());
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
		ProfessorMBean other = (ProfessorMBean) obj;
		if (professorList == null) {
			if (other.professorList != null)
				return false;
		} else if (!professorList.equals(other.professorList))
			return false;
		return true;
	}

	private void saveOrUpdate(Professor professor2) {
	}

	private List<Professor> list() {
		return null;
	}
	
}
