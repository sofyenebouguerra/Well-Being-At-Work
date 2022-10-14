package com.esprit.pidevbackend.Web;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.pidevbackend.Domain.Quiz;
import com.esprit.pidevbackend.Service.IQuizService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Quiz")
public class QuizRestController  {
	
	@Autowired
	IQuizService quizservice;
	
	@PostMapping("/addQ")
	public Quiz saveQuiz(@RequestBody Quiz quiz) {
		return quizservice.saveQuiz(quiz);
	}
	@GetMapping("/GetAllQuiz")
	public Set<Quiz> getAllQuiz(){
		return quizservice.getAllQuiz();
	}
	@GetMapping("/GetQuizee/{idQuiz}")
	public Quiz finQuizById(@PathVariable("idQuiz") Long idQuiz) {
		return quizservice.finQuizById(idQuiz);
	}
	@PutMapping("/UpQuiz")
	public Quiz updateQuiz(@RequestBody Quiz quiz) {
		return quizservice.updateQuiz(quiz);
	}
	@DeleteMapping("/DelQuiz/{idQuiz}")
	public void deleteQuizById(@PathVariable("idQuiz") Long idQuiz) {
		 quizservice.deleteQuizById(idQuiz);
	}
	@GetMapping("/GetQuizzCat/{cid}")
	public Set<Quiz> GetquizCategory(@PathVariable("cid") Long cid){
		return quizservice.GetquizCategory(cid);
	}
	@GetMapping("/GetQuizzValid")
	public Set<Quiz> getAllQuizValid(){
		return quizservice.getAllQuizValid();
	}
	@GetMapping("/GetQuizzValidByCategory/{cid}")
	public Set<Quiz> GetQuizzValidByCategoryy(@PathVariable ("cid")Long cid){
		
		return quizservice.getAllQuizValidByCategory(cid);
	}
	
	
		
	

	
	
	

}
