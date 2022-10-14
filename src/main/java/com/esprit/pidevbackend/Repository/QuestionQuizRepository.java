package com.esprit.pidevbackend.Repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.esprit.pidevbackend.Domain.QuestionQuiz;



@Repository
public interface QuestionQuizRepository extends JpaRepository<QuestionQuiz, Long>{
	@Query("select a from QuestionQuiz a where a.quiz.idQuiz=:idQuiz")
	 public Set<QuestionQuiz> SetQuestionToQuiz(@Param("idQuiz") Long idQuiz);
}
