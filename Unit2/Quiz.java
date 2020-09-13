package Unit2;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Quiz {

    public static void main(String[] args) {
        var correct = "B";
        var incorrect = new String[] {"A", "C", "D", "E"};
        var question = "How many wheels come on a standard bicycle?\n\n";
        question += "A. 1 wheel\n";
        question += "B. 2 wheels\n";
        question += "C. 3 wheels\n";
        question += "D. 4 wheels\n";
        question += "E. 5 wheels\n";

        var isCorrect = false;
        while (isCorrect == false) {
            var input = JOptionPane.showInputDialog(question);
            isCorrect = validate(input, correct, incorrect);
        }
    }

    public static boolean validate(String input, String correct, String[] incorrect) {
        if (input.toUpperCase().equals(correct.toUpperCase())) {
            JOptionPane.showMessageDialog(null, "Correct!");
            return true;
        } else if (Arrays.stream(incorrect).anyMatch(x -> x.toUpperCase().equals(input.toUpperCase()))) {
            JOptionPane.showMessageDialog(null, "Wrong answer. Please try again...");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid entry. Please try again...");
        }
        return false;
    }
}