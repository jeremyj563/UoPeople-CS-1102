package Unit4;

import java.util.*;

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
    private static int _numCorrect = 0;
    private static int _numQuestions = 0;

    private String _question;
    private String _correct;

    MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String correct) {
        var map = Map.of("A", a, "B", b, "C", c, "D", d, "E", e);
        this._question = buildQuestion(query, map);
        this._correct = correct.toUpperCase();
    }

    private String buildQuestion(String query, Map<String, String> map) {
        var newLine = System.lineSeparator();
        var question = new StringBuilder(query + newLine + newLine);
        map.forEach((key, value) -> question.append(key + ". " + value + newLine));
        return question.toString();
    }

    public void check() {
        _numQuestions++;
        var input = ask();
        if (input.equals(_correct)) {
            _numCorrect++;
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Wrong answer.");
        }
    }

    private String ask() {
        var possibleAnswers = List.of("A", "B", "C", "D", "E");
        var input = JOptionPane.showInputDialog(_question);
        if (input == null) System.exit(0); // in case user clicks 'Cancel'
        input = input.toUpperCase();
        if (possibleAnswers.contains(input)) {
            return input;
        }
        JOptionPane.showMessageDialog(null, "Invalid entry. Please try again...");
        return ask();
    }

    public static void showResult() {
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
