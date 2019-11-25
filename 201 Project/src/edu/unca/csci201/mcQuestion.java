package edu.unca.csci201;

public class mcQuestion implements Question{
	
	protected String question;
	protected String correctAnswer;
	protected String wrongAnswer1;
	protected String wrongAnswer2;
	protected String wrongAnswer3;
	
	protected mcQuestion(String question, String correctAnswer, String wrongAnswer1, String wrongAnswer2, String wrongAnswer3) {
		this.question = question;
		this.correctAnswer = correctAnswer;
		this.wrongAnswer1 = wrongAnswer1;
		this.wrongAnswer2 = wrongAnswer2;
		this.wrongAnswer3 = wrongAnswer3;
		
	}
	
	@Override
	public String getTheQuestionText() {
		String questionText =question + "  \n" + correctAnswer + "  \n"  + wrongAnswer1 + "  \n" + wrongAnswer2 + "  \n" + wrongAnswer3;
		return questionText;
	}

	@Override
	public boolean isCorrectAnswer(String answerIn) {
		if(answerIn.equals(correctAnswer)) {
			return true;
		}
		else
		return false;
	}

	@Override
	public String getCorrectAnswer() {
		return correctAnswer;
	}

}
