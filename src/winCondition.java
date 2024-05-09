import javax.swing.JOptionPane;

public class winCondition {
    public static void winCon() {
        Trivia triviaObj = new Trivia();
        int corrects = triviaObj.correctAnswers;
        int wrongs = triviaObj.wrongAnswers;
        int total = corrects + wrongs;
        JOptionPane.showMessageDialog(null, corrects);
        /*int percentage = corrects / total * 100;
        if (corrects >= wrongs) {
            JOptionPane.showMessageDialog(null, "You win! " + "You got " + percentage + "% correct! (" + corrects + " right, " + wrongs + " wrong");
        }
        else {
            JOptionPane.showMessageDialog(null, "You lose. " + "You got " + percentage + "% correct. (" + corrects + " right, " + wrongs + " wrong.");
        }*/
        }
    }



