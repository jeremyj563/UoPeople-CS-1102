package Unit3;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Quiz {

    private static int _numCorrect = 0;
    private static int _numQuestions = 0;

    public static void main(String[] args) {
        var q1 = question1();
        var q2 = question2();
        var q3 = question3();
        check(q1, "C");
        check(q2, "E");
        check(q3, "A");
        showResult();
    }

    private static String question1() {
        return """
        Who invented the computer mouse?\n
        A. Edsger Dijkstra
        B. Alan Kay
        C. Douglas Engelbart
        D. Donald Knuth
        E. Richard Stallman\n
        """;
    }

    private static String question2() {
        return """
        What year was Java SE 6 release?\n
        A. 2002
        B. 2003
        C. 2004
        D. 2005
        E. 2006\n
        """;
    }

    private static String question3() {
        return """
        Blaise Pascal is credited with the invention of which of these?\n
        A. The mechanical calculator
        B. The C++ programming language
        C. The World Wide Web
        D. The LISP programming language
        E. The first floppy disk\n
        """;
    }

    private static void check(String question, String correct) {
        _numQuestions++;
        var input = ask(question);
        if (input.equals(correct)) {
            _numCorrect++;
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Wrong answer.");
        }
    } 

    private static String ask(String question) {
        var possibleAnswers = new String[] {"A", "B", "C", "D", "E"};
        var input = JOptionPane.showInputDialog(question);
        if (input == null) System.exit(0); // in case user clicks 'Cancel'
        input = input.toUpperCase();
        if (Arrays.asList(possibleAnswers).contains(input)) {
            return input;
        }
        JOptionPane.showMessageDialog(null, "Invalid entry. Please try again...");
        return ask(question);
    }

    private static void showResult() {
        var message = _numCorrect + " out of ";
        message += _numQuestions + " questions were correct.\n";
        if (_numCorrect == _numQuestions) {
            message += "Great job!! :-)";
        } else if (_numCorrect == 0) {
            message += "Too bad, try again... :-(";
        } else {
            message += "You can do better than that! ;-)";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}