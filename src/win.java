
import javax.swing.JOptionPane;
public class win {
  public void win(){
    Trivia trivObj = new Trivia();
    int correct= trivObj.correctAnswers;/// get  correct answers value from triva class 
    int incorrect=trivObj.wrongAnswers;



  if(correct > incorrect)
  {JOptionPane.showMessageDialog(null,"congratulations you are now the smartest person in the","you won",JOptionPane.PLAIN_MESSAGE);} 
 
  if(incorrect>24)
{JOptionPane.showMessageDialog(null,"congratulations on randomly clicking on thngs until you won ","you won",JOptionPane.PLAIN_MESSAGE);} 
if(incorrect<=0)
{JOptionPane.showMessageDialog(null,"congratulations on looking up the answers ","you won",JOptionPane.PLAIN_MESSAGE);} }
}

  