public class App {
    public static void main(String[] args) throws Exception {
        Trivia triviaObj = new Trivia(); //creates object for Trivia.java
        triviaObj.questions(); 
        winCondition win = new winCondition(); //creates an object for winCondition.java
        win.winCon();
    }
}
