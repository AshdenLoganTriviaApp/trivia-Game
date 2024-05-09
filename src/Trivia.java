//import library
import javax.swing.JOptionPane;

public class Trivia {
    //variables
    public int correctAnswers; //counts correct answers
    public int wrongAnswers; //counts wrong answers

    //each set of options for each question
    Object[] options = {"1967", "1972", "1963", "1969"}; //answer options for first question
    Object[] options2 = {"197", "193", "195", "201"}; //options for second question
    Object[] options3 = {"north","east","south","west"}; // options for fourth question 
    Object[] option3 = {"Earth", "Pluto","Mercury","Venus"};
    Object[] options4 = {"USA", "Russia", "India", "China"};

    String title = "Trivia Game"; //title of game
    String question = "When was the moon landing? "; //question 1
    int answer = 3; //answer for question 1

    public void questions() {
        while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) != answer) {
            JOptionPane.showMessageDialog(null, "Incorrect, try again"); //incorrect message
            wrongAnswers++; //increase var wrongAnswers by 1
        }
        correctAnswers++; //increases var correctAnswers by 1
        JOptionPane.showMessageDialog(null, "correct! " + "Correct answers: " + correctAnswers + ", Wrong answers: " + wrongAnswers); //correct message and displays correct and wrong answers
        question = "How many countries are there in the world? "; //changes question variable to second question
        answer = 2; //changes answer variable to 3rd answer


        // code for second question
        while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]) != answer) {
            JOptionPane.showMessageDialog(null, "Incorrect, try again");
            wrongAnswers++; //increases wrong answers by 1
        }
        correctAnswers++; //increases correct answers by 1
        JOptionPane.showMessageDialog(null, "correct! " + "Correct answers: " + correctAnswers + " Wrong answers: " + wrongAnswers);
        question = "How many bones are in the human body? "; //changes question variable for 3rd question
        answer = 206; //changes answer variable for 3rd question

        int guess = Integer.parseInt(JOptionPane.showInputDialog(question, title));
        
        while (guess != answer) {
            wrongAnswers++;
            JOptionPane.showMessageDialog(null, "Incorrect, try again");
            guess = Integer.parseInt(JOptionPane.showInputDialog(question, title));
        }

        correctAnswers++; //increases correct answers by 1
        JOptionPane.showMessageDialog(null, "correct! " + "Correct answers: " + correctAnswers + " Wrong answers: " + wrongAnswers);
        question = "Which direction does the sun rise from? ";
        answer = 1;

        while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[0]) != answer) {
            JOptionPane.showMessageDialog(null, "Incorrect, try again");
            wrongAnswers++; //increases wrong answers by 1
        }
        correctAnswers++; //increases correct answers by 1
        JOptionPane.showMessageDialog(null, "correct! " + "Correct answers: " + correctAnswers + " Wrong answers: " + wrongAnswers); 
        question = "What is the smallest planet in the solar system? ";
        answer = 2;

        
        while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]) != answer) {
            JOptionPane.showMessageDialog(null, "Incorrect, try again");
            wrongAnswers++; //increases wrong answers by 1
        }
        correctAnswers++; //increases correct answers by 1
        JOptionPane.showMessageDialog(null, "correct! " + "Correct answers: " + correctAnswers + " Wrong answers: " + wrongAnswers);
        question = "What is the most populated country? ";
        answer = 3;

        while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options4, options4[0]) != answer) {
            JOptionPane.showMessageDialog(null, "Incorrect, try again");
            wrongAnswers++; //increases wrong answers by 1
        }
        correctAnswers++; //increases correct answers by 1
        JOptionPane.showMessageDialog(null, "correct! " + "Correct answers: " + correctAnswers + " Wrong answers: " + wrongAnswers);


        this.correctAnswers = correctAnswers;
        this.wrongAnswers = wrongAnswers;
    }
    
}
