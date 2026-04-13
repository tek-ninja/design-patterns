package SingleTon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionClient {
    void main() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        BasicSingleTon basicSingleTon = BasicSingleTon.getInstance();
        Constructor<BasicSingleTon> constructor = BasicSingleTon.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        BasicSingleTon instance2 = constructor.newInstance();

        System.out.println("Instance 1: " + basicSingleTon.hashCode());
        System.out.println("Instance 2: " + instance2.hashCode());

        System.out.println("Same instance? " + (basicSingleTon == instance2));
    }
}
