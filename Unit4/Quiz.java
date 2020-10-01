package Unit4;

import java.util.List;

public class Quiz {

    public static void main(String[] args) {
        var q1 = new MultipleChoiceQuestion("Who invented the computer mouse?", "Edsger Dijkstra", "Alan Kay", "Douglas Engelbart", "Donald Knuth", "Richard Stallman", "C");
        var q2 = new MultipleChoiceQuestion("What year was Java SE 6 released?", "2002", "2003", "2004", "2005", "2006", "E");
        var q3 = new MultipleChoiceQuestion("Blaise Pascal is credited with the invention of which of these?", "The mechanical calculator", "The C++ programming language", "The World Wide Web", "The LISP programming language", "The first floppy disk", "A");
        var q4 = new MultipleChoiceQuestion("What year was the initial implementation of the Rust programming language released?", "2006", "2007", "2008", "2009", "2010", "E");
        var q5 = new MultipleChoiceQuestion("The 2002 Turing Award went to three computer scientists with first names Ron, Adi, and Leonard. What was the ingenious contribution they were being awarded for?", "TCP/IP protocols", "Object-oriented programming", "RISC architecture", "RSA cryptography", "Artificial intelligence", "D");

        var questions = List.of(q1, q2, q3, q4, q5);
        questions.forEach(q -> q.check());
        MultipleChoiceQuestion.showResult();
    }
}