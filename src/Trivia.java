//import library
import javax.swing.JOptionPane;

public class Trivia {
    
    public void questions() {
        Object[] options = {"answer1", "answer2", "answer3", "answer4"};
        String title = "Trivia Game";
        String question1 = "placeholder";
        int answer1 = 1;
        while (JOptionPane.showOptionDialog(null, question1, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]) != answer1) {
            JOptionPane.showMessageDialog(null, "Oh no you're wrong");
        }
        JOptionPane.showMessageDialog(null, "correct!");
    }
}
