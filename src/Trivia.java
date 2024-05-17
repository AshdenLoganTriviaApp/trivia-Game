//import library
import javax.swing.JOptionPane;

public class Trivia {
    //variables
    public static int correctAnswers; //counts correct answers
    public static int wrongAnswers; //counts wrong answers

    //each set of options for each question
    Object[] options = {"1967", "1972", "1963", "1969"}; //answer options for first question
    Object[] options2 = {"197", "193", "195", "201"}; //options for second question
    Object[] options3 = {"north","east","south","west"}; // options for fourth question 
    Object[] option3 = {"Earth", "Pluto","Mercury","Venus"};
    Object[] options4 = {"USA", "Russia", "India", "China"};
    Object[] options5 = {"Machu Picchu","Colosseum","Great Wall of China","Pyramid of Giza"};
    Object[] options6 = {"Thomas Edison","Nikola Tesla","Albert Einstein"," Isaac Newton"};
    Object[] options7 = {"gold","silver","Argon","iodine"};
    Object[] options8 = {"1889","1912","1915","1920"};
    Object[] options9 = {"Britain","china","Ireland","India"};
    Object[] options10 = {"1776","1763","1867","1864"};

    String title = "Trivia Game"; //title of game
    String question = "When was the moon landing? "; //question 1
    int answer = 3; //answer for question 1

    public void questions() {
        while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) != answer) {
            JOptionPane.showMessageDialog(null, "Incorrect, try again"); //incorrect message
            wrongAnswers++; //increase var wrongAnswers by 1
        }
        correctAnswers++; //increases var correctAnswers by 1
        JOptionPane.showMessageDialog(null, "Correct! " + "Correct answers: " + correctAnswers + ", Wrong answers: " + wrongAnswers); //correct message and displays correct and wrong answers
        question = "How many countries are there in the world? "; //changes question variable to second question
        answer = 2; //changes answer variable to 3rd answer


        // code for second question
        while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]) != answer) {
            JOptionPane.showMessageDialog(null, "Incorrect, try again");
            wrongAnswers++; //increases wrong answers by 1
        }
        correctAnswers++; //increases correct answers by 1
        JOptionPane.showMessageDialog(null, "Correct! " + "Correct answers: " + correctAnswers + " Wrong answers: " + wrongAnswers);
        question = "How many bones are in the human body? "; //changes question variable for 3rd question
        answer = 206; //changes answer variable for 3rd question

        int guess = Integer.parseInt(JOptionPane.showInputDialog(question, title));
        
        while (guess != answer) {
            wrongAnswers++;
            JOptionPane.showMessageDialog(null, "Incorrect, try again");
            guess = Integer.parseInt(JOptionPane.showInputDialog(question, title));
        }

        correctAnswers++; //increases correct answers by 1
        JOptionPane.showMessageDialog(null, "Correct! " + "Correct answers: " + correctAnswers + " Wrong answers: " + wrongAnswers);
        question = "Which direction does the sun rise from? ";
        answer = 1;

        while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[0]) != answer) {
            JOptionPane.showMessageDialog(null, "Incorrect, try again");
            wrongAnswers++; //increases wrong answers by 1
        }
        correctAnswers++; //increases correct answers by 1
        JOptionPane.showMessageDialog(null, "Correct! " + "Correct answers: " + correctAnswers + " Wrong answers: " + wrongAnswers); 
        question = "What is the smallest planet in the solar system? ";
        answer = 2;

        
        while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]) != answer) {
            JOptionPane.showMessageDialog(null, "Incorrect, try again");
            wrongAnswers++; //increases wrong answers by 1
        }
        correctAnswers++; //increases correct answers by 1
        JOptionPane.showMessageDialog(null, "Correct! " + "Correct answers: " + correctAnswers + " Wrong answers: " + wrongAnswers);
        question = "what is the most populated country  ";
        answer = 3;


        
            while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options4, options4[0]) != answer) {
                JOptionPane.showMessageDialog(null, "Incorrect, try again"); //incorrect message
                wrongAnswers++; //increase var wrongAnswers by 1
            }
            correctAnswers++; //increases var correctAnswers by 1
            JOptionPane.showMessageDialog(null, "Correct! " + "Correct answers: " + correctAnswers + ", Wrong answers: " + wrongAnswers); //correct message and displays correct and wrong answers
            question = "whitch of these is not one of the modern seven wonders of the world  "; //changes question variable to second question
            answer = 3; //changes answer variable to 3rd answer 


            while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[0]) != answer) {
                JOptionPane.showMessageDialog(null, "Incorrect, try again"); //incorrect message
                wrongAnswers++; //increase var wrongAnswers by 1
            }

            
            correctAnswers++; //increases var correctAnswers by 1
            JOptionPane.showMessageDialog(null, "Correct! " + "Correct answers: " + correctAnswers + ", Wrong answers: " + wrongAnswers); //correct message and displays correct and wrong answers
            question = " who invented the light bulb?  "; //changes question variable to second question
            answer = 0; //changes answer variable to 3rd answer 


            while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options6, options6[0]) != answer) {
                JOptionPane.showMessageDialog(null, "Incorrect, try again"); //incorrect message
                wrongAnswers++; //increase var wrongAnswers by 1
            }

            correctAnswers++; //increases var correctAnswers by 1
            JOptionPane.showMessageDialog(null, "Correct! " + "Correct answers: " + correctAnswers + ", Wrong answers: " + wrongAnswers); //correct message and displays correct and wrong answers
            question = " what element is represented by the atomic symbol (Ag) ?  "; //changes question variable to second question
            answer = 1; //changes answer variable to 3rd answer 


            while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options7, options7[0]) != answer) {
                JOptionPane.showMessageDialog(null, "Incorrect, try again"); //incorrect message
                wrongAnswers++; //increase var wrongAnswers by 1
            }

            correctAnswers++; //increases var correctAnswers by 1
            JOptionPane.showMessageDialog(null, "Correct! " + "Correct answers: " + correctAnswers + ", Wrong answers: " + wrongAnswers); //correct message and displays correct and wrong answers
            question = "  in what year did the Titanic sink ?  "; //changes question variable to second question
            answer = 1; //changes answer variable to 3rd answer 


            while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options8, options8[0]) != answer) {
                JOptionPane.showMessageDialog(null, "Incorrect, try again"); //incorrect message
                wrongAnswers++; //increase var wrongAnswers by 1
            }
            correctAnswers++; //increases var correctAnswers by 1
            JOptionPane.showMessageDialog(null, "Correct! " + "Correct answers: " + correctAnswers + ", Wrong answers: " + wrongAnswers); //correct message and displays correct and wrong answers
            question = "  what country was Chess invented ?  "; //changes question variable to second question
            answer = 3; //changes answer variable to 3rd answer 


            while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options9, options9[0]) != answer) {
                JOptionPane.showMessageDialog(null, "Incorrect, try again"); //incorrect message
                wrongAnswers++; //increase var wrongAnswers by 1
            }
            correctAnswers++; //increases var correctAnswers by 1
            JOptionPane.showMessageDialog(null, "Correct! " + "Correct answers: " + correctAnswers + ", Wrong answers: " + wrongAnswers); //correct message and displays correct and wrong answers
            question = "  in what year did Canada founded ?  "; //changes question variable to second question
            answer = 2; //changes answer variable to 3rd answer 


            while (JOptionPane.showOptionDialog(null, question, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options10, options10[0]) != answer) {
                JOptionPane.showMessageDialog(null, "Incorrect, try again"); //incorrect message
                wrongAnswers++; //increase var wrongAnswers by 1

            }
            
    }

}



