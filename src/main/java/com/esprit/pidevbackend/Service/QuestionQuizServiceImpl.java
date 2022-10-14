package com.esprit.pidevbackend.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.pidevbackend.Domain.QuestionQuiz;
import com.esprit.pidevbackend.Domain.Quiz;
import com.esprit.pidevbackend.Repository.QuestionQuizRepository;
import com.esprit.pidevbackend.Repository.QuizRepository;


@Service
public class QuestionQuizServiceImpl implements IQuestionQuizService {

	@Autowired
	QuestionQuizRepository questionRepository;
	@Autowired
	QuizRepository quizRepository;
	

	@Override
	public QuestionQuiz addQuestion(QuestionQuiz qt) {
		
		return questionRepository.save(qt);
	}

	@Override
	public Set<QuestionQuiz> getQuestions() {
		
		return new HashSet<>( questionRepository.findAll()) ;
	}

	@Override
	public QuestionQuiz finQuestById(Long idq) {
		
		return questionRepository.findById(idq).orElse(null);
	}

	@Override
	public void DeleteQt(Long idq) {
		questionRepository.deleteById(idq);
		
	}

	@Override
	public void UpdateQt(QuestionQuiz qt) {
		questionRepository.save(qt);
		
	}

	

	@Override
	public Set<QuestionQuiz> SetQuestionToQuiz(Long idQuiz) {
		// TODO Auto-generated method stub
		return questionRepository.SetQuestionToQuiz(idQuiz);
	}

	@Override
	public QuestionQuiz AddQuestionToQuiz(QuestionQuiz question, Long idQuiz) {
		 Quiz quiz =quizRepository.findById(idQuiz).orElse(null);
	        questionRepository.save(question);
	      
	        question.setQuiz(quiz);
	        return question;
		
	}

	@Override
	public void affecterQuestionToQuiz( Long idq,Long idQuiz) {
		QuestionQuiz quest=questionRepository.findById(idq).orElse(null);
		Quiz quiz=quizRepository.findById(idQuiz).orElse(null);
		quiz.getQuestions().add(quest);
		quizRepository.save(quiz);
		
	}

	@Override
	public void ajouterEtaffecterListequestions(List<QuestionQuiz> lb, Long idQuiz) {
		Quiz quiz = quizRepository.findById(idQuiz).orElse(null);
	      for (QuestionQuiz question : lb) {
	    	  question.setQuiz(quiz);
			questionRepository.save(question);
		
	}

	}
	

	@Override
	public Set<QuestionQuiz> getQuestionsOfQuizz(Quiz quiz) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

		


	
	
	

	
	
	
}


