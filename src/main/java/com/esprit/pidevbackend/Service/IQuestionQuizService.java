package com.esprit.pidevbackend.Service;

import java.util.List;
import java.util.Set;

import com.esprit.pidevbackend.Domain.QuestionQuiz;
import com.esprit.pidevbackend.Domain.Quiz;



public interface IQuestionQuizService {
	public QuestionQuiz addQuestion (QuestionQuiz qt);
    public Set<QuestionQuiz> getQuestions();
    public QuestionQuiz finQuestById(Long idq);
    public void DeleteQt (Long idq);
    public void UpdateQt (QuestionQuiz qt);
   
    
    public Set<QuestionQuiz> SetQuestionToQuiz(Long idQuiz);
    public QuestionQuiz AddQuestionToQuiz(QuestionQuiz question, Long idQuiz);
   
    public void affecterQuestionToQuiz(Long idQuiz,Long idq );
   
    public void ajouterEtaffecterListequestions(List<QuestionQuiz> lb, Long idQuiz);
    
    public Set<QuestionQuiz> getQuestionsOfQuizz(Quiz quiz);
    
    

}

