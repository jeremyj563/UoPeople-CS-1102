package test;

public class test {
    public static void main(String[] args) {
        boolean loop = true; int count = 1;
        do {
            System.out.println("Do-While - count: " + count++);
            loop = false;
        } while (loop);
    }
}
