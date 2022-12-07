package Lab4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        for(Method m : Methods.class.getDeclaredMethods()){
            if (m.isAnnotationPresent(CallMethods.class)){
                CallMethods annotation = m.getAnnotation((CallMethods.class));
                m.setAccessible(true);
                for (int i = 0; i < annotation.value(); ++i){
                    try{
                        m.invoke(null);
                    } catch (InvocationTargetException|IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(m.getName() + " was called " + annotation.value() + " time(s)");
                System.out.println("It is a " + Modifier.toString(m.getModifiers()) + " method ");
                System.out.println("---------");
            }
        }
    }
}
