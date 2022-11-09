package Lab2.Exceptions;

public class DivideByZeroExp extends ArithmeticException{

    private int detail;

    public DivideByZeroExp(int a){detail = a;}

    @Override
    public String toString(){
        return "DivideByZeroExp{" + "detail=" + detail + '}';
    }
}
