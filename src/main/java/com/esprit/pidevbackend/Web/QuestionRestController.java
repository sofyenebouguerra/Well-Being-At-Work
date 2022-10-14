package com.esprit.pidevbackend.Web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.pidevbackend.Domain.QuestionQuiz;
import com.esprit.pidevbackend.Domain.Quiz;
import com.esprit.pidevbackend.Service.IQuestionQuizService;
import com.esprit.pidevbackend.Service.IQuizService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Question")
public class QuestionRestController {
	
	@Autowired
	IQuestionQuizService questionService;
	@Autowired
	IQuizService quizservice;
	
	@PostMapping("/addQue")
	public QuestionQuiz addQuestion (@RequestBody QuestionQuiz question) {
		return questionService.addQuestion(question);
	}
	@GetMapping("/GetAllQue")
    public Set<QuestionQuiz> getQuestions(){
    	return questionService.getQuestions();
    }
	@GetMapping("/GetQue/{idQue}")
    public QuestionQuiz finQuestById(@PathVariable("idQue") Long idq){
    	return questionService.finQuestById(idq);
    }
	@DeleteMapping("/DelQue/{idQue}")
    public void DeleteQt (@PathVariable("idQue") Long idq) {
    	 questionService.DeleteQt(idq);
    }
    @PutMapping("/UpQue")
    public void UpdateQt (@RequestBody QuestionQuiz qt) {
      questionService.UpdateQt(qt);
    }
    @GetMapping("/GetQuestion/{idQuiz}")
    public Set<QuestionQuiz> SetQuestionToQuiz(@PathVariable("idQuiz")Long idQuiz){
    	return questionService.SetQuestionToQuiz(idQuiz);
    }
 
    @PostMapping("/addQuestion/{idQui}")
	public QuestionQuiz AddQuestionToQuizt(@RequestBody QuestionQuiz question,@PathVariable("idQui") Long idQuiz) {
    	QuestionQuiz ques= questionService.AddQuestionToQuiz(question, idQuiz);
    	return ques;
    	 
    }
    @PutMapping("/UpQuest/{idQuest}/{idQuizzz}")
    public void affecterQuestionToQuiz(@PathVariable("idQuest")  Long idq,@PathVariable("idQuizzz") Long idQuiz) {
    	questionService.affecterQuestionToQuiz(idQuiz, idQuiz);
    }
    @PostMapping("/addListQuestion/{idQu}")
    public void ajouterEtaffecterListequestionss(@RequestBody List<QuestionQuiz> lb,@PathVariable("idQu") Long idQuiz) {
    	questionService.ajouterEtaffecterListequestions(lb, idQuiz);
    }
    
    @GetMapping("/GetQuestionQuiz/{idQuiz}")
    public ResponseEntity<?> getQuestionOfQuiz(@PathVariable("idQuiz") Long idQuiz){
    	Quiz quiz=this.quizservice.finQuizById(idQuiz);
    	Set<QuestionQuiz> questions=quiz.getQuestions();
    	List list=new ArrayList(questions);
    	if(list.size()>Integer.parseInt(quiz.getNumberOfQuestions())) {
    		list=list.subList(0, Integer.parseInt(quiz.getNumberOfQuestions()+1));
    		
    	}
    	Collections.shuffle(list);
    	return ResponseEntity.ok(list);
    	
    }
    
    @GetMapping("/GetQuestionQu/all/{idQuiz}")
    public ResponseEntity<?> getQuestionOfQuizall(@PathVariable("idQuiz") Long idQuiz){
    	Quiz quiz=new Quiz();
    	quiz.setIdQuiz(idQuiz);
    	Set<QuestionQuiz> questionOfQuiz=this.questionService.SetQuestionToQuiz(idQuiz);
    	return ResponseEntity.ok(questionOfQuiz);
    	
    }
    //evalQuiz
    /*@PostMapping("/evalQuiz")
    public ResponseEntity<?> evalQuiz(@RequestBody List<QuestionQuiz> questions){
    	System.out.println(questions);
    	double marksGot = 0;
    	int correctAnswers = 0;
    	int attempted = 0;
    	for(QuestionQuiz q:questions ){
    	QuestionQuiz question=	this.questionService.finQuestById(q.getIdq());
    	if(question.getAnswer().equals(q.getGivenAnswer())) {
    		//correct
    		correctAnswers++;
    		double marksSingle=Double.parseDouble(questions.get(0).getQuiz().getMaxMarks())/questions.size();
    		 marksGot += marksSingle;
    	}if(q.getGivenAnswer() !=null ) {
    		attempted++;
    	}
    	};
    	Map<String, Object> map=new HashMap<>();
    	map.put("marksGot", marksGot);
		map.put("attempted", attempted);
		map.put("correctAnswers", correctAnswers);
    	
		return ResponseEntity.ok(map);
    	
    	
    }*/
	
	
	
	
	
    
    
    
    
    
}

