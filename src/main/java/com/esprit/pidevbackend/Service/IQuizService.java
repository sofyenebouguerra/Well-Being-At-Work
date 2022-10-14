package com.esprit.pidevbackend.Service;

import java.util.Set;

import com.esprit.pidevbackend.Domain.Quiz;



public interface IQuizService {
	public Quiz saveQuiz(Quiz quiz);
	public Set <Quiz>  getAllQuiz();
	public Quiz finQuizById(Long idQuiz);
	public Quiz updateQuiz(Quiz quiz);
	public void deleteQuizById(Long idQuiz);
	public Set<Quiz> GetquizCategory(Long cid);
	public Set<Quiz> getAllQuizValid();
	public Set<Quiz> getAllQuizValidByCategory(Long cid);

}
