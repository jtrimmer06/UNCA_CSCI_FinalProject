package edu.unca.csci201;

public class QuizTime extends Quiz{

	public static void main(String[] args) {
		
		Quiz quiz = new Quiz();
		
		//Quiz Title and Description
		System.out.println("");
		System.out.println("			,:'~~Quiz Time~~':,");
		System.out.println("");
		System.out.println("");
		System.out.println("The first five questions are multiple choice, answer each of them by entering in the correct answer."
				+ "\n" + "The next ten are true or false questions, answer them by submitting 'true' or 'false'."
				+ "\n" + "The last ten are math questions, respond with the integer the equation is equal to."
				+ "\n" + "Each question is worth four points. ");
		//Questions
			//multiple choice 
		 mcQuestion mc1 = new mcQuestion ("Whats Joes Name?", "Joe", "Jim", "John", "Jack"); 
		 quiz.AddQuestion(mc1);
		 mcQuestion mc2 = new mcQuestion ("Which state is Asheville in?", "NC", "SC", "PA", "CA");
		 quiz.AddQuestion(mc2);
		 mcQuestion mc3 = new mcQuestion ("Which one of these dont fit with the others?", "Proper back support", "Gamers", "Programmers", "Students");
		 quiz.AddQuestion(mc3);
		 mcQuestion mc4 = new mcQuestion ("North Carolina doesnt have what?", "A bad time", "Mountains", "Wetlands", "Beaches");
		 quiz.AddQuestion(mc4);
		 mcQuestion mc5 = new mcQuestion ("The best thing about November is ____.", "Turkey", "Turkey", "Turkey", "Turkey");
		 quiz.AddQuestion(mc5);	
		 	//true false
		 tfQuestion tf1 = new tfQuestion ("This is a question.", "false");
		 quiz.AddQuestion(tf1);
		 tfQuestion tf2 = new tfQuestion ("Is this a question?", "true");
		 quiz.AddQuestion(tf2);
		 tfQuestion tf3 = new tfQuestion ("Questions must be answered to complete the quiz.", "true");
		 quiz.AddQuestion(tf3);
		 tfQuestion tf4 = new tfQuestion ("Bears would make great pets.", "true");
		 quiz.AddQuestion(tf4);
		 tfQuestion tf5 = new tfQuestion ("Feet arent shoes.", "true");
		 quiz.AddQuestion(tf5);
		 tfQuestion tf6 = new tfQuestion ("You shouldnt wave your flag to a ship of fools.", "true");
		 quiz.AddQuestion(tf6);
		 tfQuestion tf7 = new tfQuestion ("The first step is the easiest.", "false");
		 quiz.AddQuestion(tf7);
		 tfQuestion tf8 = new tfQuestion ("The costumer is always an expert.", "false");
		 quiz.AddQuestion(tf8);
		 tfQuestion tf9 = new tfQuestion ("Firetrucks are red.", "true");
		 quiz.AddQuestion(tf9);
		 tfQuestion tf10 = new tfQuestion ("Hong Kong protestors are not to be forgotten", "true");
		 quiz.AddQuestion(tf10);
		 	//math
		 mathQuestion m1 = new mathQuestion ("14+37=", "51");
		 quiz.AddQuestion(m1);
		 mathQuestion m2 = new mathQuestion ("21+19=", "40");
		 quiz.AddQuestion(m2);
		 mathQuestion m3 = new mathQuestion ("23-38=", "-15");
		 quiz.AddQuestion(m3);
		 mathQuestion m4 = new mathQuestion ("21/3=", "7");
		 quiz.AddQuestion(m4);
		 mathQuestion m5 = new mathQuestion ("1/4=", ".25");
		 quiz.AddQuestion(m5);
		 mathQuestion m6 = new mathQuestion ("11*3=", "33");
		 quiz.AddQuestion(m6);
		 mathQuestion m7 = new mathQuestion ("9*47=", "423");
		 quiz.AddQuestion(m7);
		 mathQuestion m8 = new mathQuestion ("3(1+5)=", "18");
		 quiz.AddQuestion(m8);
		 mathQuestion m9 = new mathQuestion ("(12+4)/4=", "4");
		 quiz.AddQuestion(m9);
		 mathQuestion m10 = new mathQuestion ("(2+2)^2=", "16");
		 quiz.AddQuestion(m10);
		 
		 
		 //Start quiz
		 quiz.giveQuiz();
		
		 
		 //Quiz finish
		 System.out.println("");
		 System.out.println("");
		 System.out.println("Quiz Complete.");
		 System.out.println("You have scored a " + quiz.score + " on the quiz.");
		 
	}

}
