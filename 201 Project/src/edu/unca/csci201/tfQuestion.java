package edu.unca.csci201;

public class tfQuestion implements Question {
	
	protected String question;
	protected String answer;
	
	public tfQuestion(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}

	@Override
	public String getTheQuestionText() {
		String questionText = question + "\n";
		return questionText;
	}

	@Override
	public boolean isCorrectAnswer(String answerIn) {
		if(answerIn.equals(answer)){			
			return true;
			}
			else {
				return false;
			}
	}

	@Override
	public String getCorrectAnswer() {
		return answer;
	}

}
