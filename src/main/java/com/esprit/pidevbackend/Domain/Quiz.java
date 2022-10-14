package com.esprit.pidevbackend.Domain;
import java.io.Serializable;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
public class Quiz implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Long idQuiz;
	
	private String title;
	
	private String description;
	private String maxMarks;
	private String numberOfQuestions;
	private Boolean active = false;

	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
    private Category category;
	
	@OneToMany(mappedBy="quiz" ,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JsonIgnore
	private Set<QuestionQuiz> questions=new LinkedHashSet<>();


	


	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	

	public Quiz(String title, String description, String maxMarks, String numberOfQuestions, Boolean active,
			Category category, Set<QuestionQuiz> questions) {
		super();
		this.title = title;
		this.description = description;
		this.maxMarks = maxMarks;
		this.numberOfQuestions = numberOfQuestions;
		this.active = active;
		this.category = category;
		this.questions = questions;
	}





	public Long getIdQuiz() {
		return idQuiz;
	}



	public void setIdQuiz(Long idQuiz) {
		this.idQuiz = idQuiz;
	}



	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getMaxMarks() {
		return maxMarks;
	}


	public void setMaxMarks(String maxMarks) {
		this.maxMarks = maxMarks;
	}


	public String getNumberOfQuestions() {
		return numberOfQuestions;
	}


	public void setNumberOfQuestions(String numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}


	public Boolean getActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Set<QuestionQuiz> getQuestions() {
		return questions;
	}


	public void setQuestions(Set<QuestionQuiz> questions) {
		this.questions = questions;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	


	

}
