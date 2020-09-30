package test;

// the definition of the Dog class which can be used to create 'Dog' object instances
public class Dog {
    private enum Breed { YORKIE, LAB, MASTIFF }
    private enum State { BARKING, PLAYING, SLEEPING }

    public static void main(String[] args) {
        // create an instance of the Dog class with its own state
        var yorkie = new Dog(Breed.YORKIE);
        yorkie.eat();
        System.out.println(yorkie.getState());  // BARKING

        // create a second instance of the Dog class with its own state
        var lab = new Dog(Breed.LAB);
        lab.eat();
        System.out.println(lab.getState());     // PLAYING

        // create a third instance of the Dog class with its own state
        var mastiff = new Dog(Breed.MASTIFF);
        mastiff.eat();
        System.out.println(mastiff.getState()); // SLEEPING
    }
    
    private Breed breed;

    private State state;
    public State getState() { return state; }

    public Dog(Breed breed) {
        this.breed = breed;
    }

    public void eat() {
        switch (this.breed) {
            case YORKIE:
                this.state = State.BARKING; break;
            case LAB:
                this.state = State.PLAYING; break;
            case MASTIFF:
                this.state = State.SLEEPING; break;
        }
    }
}