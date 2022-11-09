package Lab1;

import Lab1.Moving.MovingByFoot;
import Lab1.Moving.MovingByHorse;
import Lab1.Moving.MovingInFlight;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(new MovingByHorse());

        hero.move();

        hero.setMoveStrategy(new MovingByFoot());

        hero.move();

        hero.setMoveStrategy(new MovingInFlight());

        hero.move();
    }
}
