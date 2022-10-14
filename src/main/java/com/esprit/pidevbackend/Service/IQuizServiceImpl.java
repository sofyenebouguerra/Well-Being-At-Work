package com.esprit.pidevbackend.Service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.esprit.pidevbackend.Domain.Quiz;
import com.esprit.pidevbackend.Repository.QuizRepository;


@Service
@Transactional
public class IQuizServiceImpl implements IQuizService {
	
	
	@Autowired 
	QuizRepository quizrepository;

	
	
	
	
	
	@Override
	public Set<Quiz> getAllQuiz() {
		
		return new HashSet<> (quizrepository.findAll());
	}



	@Override
	public Quiz updateQuiz(Quiz quiz) {
		
		return quizrepository.save(quiz);
	}

	@Override
	public void deleteQuizById(Long idQuiz) {
		quizrepository.deleteById(idQuiz);
		
	}


	@Override
	public Quiz finQuizById(Long idQuiz) {
		return quizrepository.findById(idQuiz).orElse(null);
		
	}



	@Override
	public Quiz saveQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizrepository.save(quiz);
	}



	@Override
	public Set<Quiz> GetquizCategory(Long cid) {
		// TODO Auto-generated method stub
		return quizrepository.GetquizCategory(cid);
	}



	@Override
	public Set<Quiz> getAllQuizValid() {
		// TODO Auto-generated method stub
		return quizrepository.getAllQuizValid();
	}



	@Override
	public Set<Quiz> getAllQuizValidByCategory(Long cid) {
	return quizrepository.getAllQuizValidByCategory(cid);
	}



	


	/*@Override
	public Set<Quiz> SetDeQuizParCategorie(Long cid) {
		// TODO Auto-generated method stub
		return quizrepository.GetquizCategory(cid);
	}*/



	









	
	


	

}
