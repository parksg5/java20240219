package ch12.sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] declaredMethods = Service.class.getDeclaredMethods();
        for (Method method : declaredMethods) {
            //PrintAnnotation 얻기
            PrintAnnotation printAnnotation = method.getAnnotation
                    (PrintAnnotation.class);
            printLine(printAnnotation);

            method.invoke(new Service());
            printLine(printAnnotation);
        }
    }

    private static void printLine(PrintAnnotation annotation) {
        int number = annotation.number();
        for (int i = 0; i < number; i++) {
            String value = annotation.value();
            System.out.print(value);
        }
        System.out.println();
    }
}
