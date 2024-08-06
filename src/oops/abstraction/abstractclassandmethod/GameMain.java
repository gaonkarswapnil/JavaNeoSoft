package oops.abstraction.abstractclassandmethod;

/*
Define an abstract class Game with a template method play() that calls three abstract methods: initialize(), startPlay(), and endPlay().
Create subclasses Football and Cricket that implement these abstract methods.
Write a main class to play both games using the play() method.
*/

abstract class Game{
    final void play(){
        initialize();
        startPlay();
        endPlay();
    }

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
}

class Football extends Game{

    @Override
    void initialize() {
        System.out.println("Football game is successfully organise");
    }

    @Override
    void startPlay() {
        System.out.println("Football game started");
    }

    @Override
    void endPlay() {
        System.out.println("Football game ended");
    }
}

class Cricket extends Game{

    @Override
    void initialize() {
        System.out.println("Cricket game is successfully organise");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket game started");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket game ended");
    }
}

public class GameMain {
    public static void main(String[] args) {
        Game football = new Football();
        football.play();

        Game cricket = new Cricket();
        cricket.play();
    }
}
