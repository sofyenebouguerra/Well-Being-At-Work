package com.esprit.pidevbackend.Domain;


import java.io.Serializable;




import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class QuestionQuiz implements Serializable {
	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Long idq;
	

	    private  int point;
	 
	   @Column(length=5000)
	    private String content;
	    private String image;
	    
	    private String option1;
	    private String option2;
	    
	    private String option3;
	    
	    private String option4;
	    
	 
	   
	    private String answer;
	    @Transient
	    private String givenAnswer;

	  
	   
	    @ManyToOne
		@JsonIgnore
		private Quiz quiz;

	   
		
		public QuestionQuiz() {
			
		}



		public QuestionQuiz(int point, String content, String image, String option1, String option2, String option3,
				String option4, String answer, Quiz quiz) {
			super();
			this.point = point;
			this.content = content;
			this.image = image;
			this.option1 = option1;
			this.option2 = option2;
			this.option3 = option3;
			this.option4 = option4;
			this.answer = answer;
			this.quiz = quiz;
		}



		public Long getIdq() {
			return idq;
		}



		public void setIdq(Long idq) {
			this.idq = idq;
		}



		public int getPoint() {
			return point;
		}



		public void setPoint(int point) {
			this.point = point;
		}



		public String getContent() {
			return content;
		}



		public void setContent(String content) {
			this.content = content;
		}



		public String getImage() {
			return image;
		}



		public void setImage(String image) {
			this.image = image;
		}



		public String getOption1() {
			return option1;
		}



		public void setOption1(String option1) {
			this.option1 = option1;
		}



		public String getOption2() {
			return option2;
		}



		public void setOption2(String option2) {
			this.option2 = option2;
		}



		public String getOption3() {
			return option3;
		}



		public void setOption3(String option3) {
			this.option3 = option3;
		}



		public String getOption4() {
			return option4;
		}



		public void setOption4(String option4) {
			this.option4 = option4;
		}



		public String getAnswer() {
			return answer;
		}



		public void setAnswer(String answer) {
			this.answer = answer;
		}



		public Quiz getQuiz() {
			return quiz;
		}



		public void setQuiz(Quiz quiz) {
			this.quiz = quiz;
		}



		public static long getSerialversionuid() {
			return serialVersionUID;
		}



		public String getGivenAnswer() {
			return givenAnswer;
		}



		public void setGivenAnswer(String givenAnswer) {
			this.givenAnswer = givenAnswer;
		}
		

		

	

		

		
	
	
	
	
}
