package test;
public class Food {
    static int count;
    private String flavor = "sweet";
    Food() { count++; }
    void setFlavor(String s) { flavor = s; }
    String getFlavor() { return flavor; }
    static public void main(String[] args) {
        Food pepper = new Food();
        new Food();
        System.out.println(pepper.count);
    }
}