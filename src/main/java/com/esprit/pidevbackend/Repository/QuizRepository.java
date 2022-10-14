package com.esprit.pidevbackend.Repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.esprit.pidevbackend.Domain.Quiz;



@Repository
public interface QuizRepository  extends JpaRepository<Quiz, Long> {
	@Query("Select q FROM Quiz q where q.category.cid = :cid")
	public Set<Quiz> GetquizCategory(@Param("cid") Long cid);
	 @Query(value = "SELECT q FROM Quiz q where q.active=True")
	    public Set<Quiz> getAllQuizValid();
	 @Query(value = "SELECT q FROM Quiz q where q.category.cid = :cid and q.active=True")
	    public Set<Quiz> getAllQuizValidByCategory(@Param("cid") Long cid);
	
}

