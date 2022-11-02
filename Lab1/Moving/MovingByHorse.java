package Lab1.Moving;

import Lab1.MoveStrategy;

public class MovingByHorse implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("I am riding a horse");
    }
}
