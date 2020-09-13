package Unit2;

public class example3_for {
    public static void main(String[] args) {

        // Example 3: for
        for (int count = 10; count >= 5; count--) {
            System.out.println("For - count: " + count);
        }

        // equivalent while
        int count = 10;
        while (count >= 5) {
            System.out.println("While - count: " + count--);
        }

        // equivalent do-while
        count = 10;
        do {
            System.out.println("Do-While - count: " + count--);
        } while (count >= 5);
    }
}
