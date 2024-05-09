public class App {
    public static void main(String[] args) throws Exception {
        Trivia triviaObj = new Trivia();
        triviaObj.questions();
        winCondition win = new winCondition();
        win.winCon();
    }
}
