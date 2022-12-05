package Lab4;

public class Methods {

    public static void  method1(){
        System.out.println("This is first method");
    }

    public static void  method2(){
        System.out.println("This is second method");
    }

    @CallMethods(3)
    protected static void  method3(){
        System.out.println("This is third method");
    }

    protected static void  method4(){
        System.out.println("This is fourth method");
    }

    @CallMethods(2)
    private static void  method5(){
        System.out.println("This is fifth method");
    }

    @CallMethods(5)
    private static void  method6(){
        System.out.println("This is sixth method");
    }
}
