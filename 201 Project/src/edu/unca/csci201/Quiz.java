package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {

	private String answerIn;
	protected double score;
	private int count;
	
	Question questionList[] = new Question [25];
	
	public void AddQuestion(Question q) {
		
		questionList[count] = q;
		count++;
	}
	
	;
	
	public double giveQuiz() {
		for(int i = 0; i < 25; i++) {
			System.out.println(questionList[i].getTheQuestionText());
			Scanner scan1 = new Scanner(System.in);
			answerIn  = scan1.nextLine();
			if(questionList[i].isCorrectAnswer(answerIn)) {
				score+=4;
				
			}
			
		}
		
		return score;
	}
	

}
