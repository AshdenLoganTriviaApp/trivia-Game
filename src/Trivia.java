//import library
import javax.swing.JOptionPane;

public class Trivia {
    
    public void questions() {
        Object[] options = {"answer1", "answer2", "answer3", "answer4"};
        String title = "Trivia Game";
        String question1 = "placeholder";
        int n = JOptionPane.showOptionDialog(null, question1, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

    }
}
