package Lab1;

public class Hero {
    private MoveStrategy moveStrategy;

    public Hero(MoveStrategy moveStrategy){
        this.moveStrategy = moveStrategy;
    }

    public void move(){
        this.moveStrategy.move();
    }

    public void setMoveStrategy(MoveStrategy moveStrategy){
        this.moveStrategy = moveStrategy;
    }
}
