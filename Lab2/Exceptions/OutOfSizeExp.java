package Lab2.Exceptions;

public class OutOfSizeExp extends ArithmeticException{

    private int detail;

    public OutOfSizeExp(int a){detail = a;}

    @Override
    public String toString() {
        return "OutOfSizeExp{" + "detail=" + detail + '}';
    }
}
