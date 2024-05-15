import javax.swing.JOptionPane;

public class winCondition {
    public void winCon() {
        Trivia trivObj = new Trivia();
        int corrects = trivObj.correctAnswers; //takes value of "correctAnswers" variable from Trivia.java and makes a new variable here
        int wrongs = trivObj.wrongAnswers; //same as above but with wrongAnswers variable

        if (corrects >= wrongs) { //user wins if they got more correct answers than incorrect ones
            JOptionPane.showMessageDialog(null, "You win! " + "You got " + corrects + " right, " + wrongs + " wrong");
        } else { //user loses if they got more wrong answers than correct ones
            JOptionPane.showMessageDialog(null, "You lose. " + "You got " + corrects + " right, " + wrongs + " wrong.");
        }
        }
    }



