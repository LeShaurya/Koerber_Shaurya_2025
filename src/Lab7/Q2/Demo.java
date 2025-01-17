package Lab7.Q2;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        AnnotatedClass annotatedClass = new AnnotatedClass();
        Class<?> clazz = annotatedClass.getClass();
        getAnnotations(clazz);

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            getAnnotations(method);
        }

        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            getAnnotations(constructor);
        }

    }

    public static void getAnnotations(AnnotatedElement annotatedElement) {
        if(annotatedElement.isAnnotationPresent(Lab7.Q2.Author.class)) {
            Lab7.Q2.Author authorAnnotation = annotatedElement.getAnnotation(Lab7.Q2.Author.class);
            System.out.println(authorAnnotation.name());
        }
        if(annotatedElement.isAnnotationPresent(Lab7.Q2.Version.class)) {
            Lab7.Q2.Version versionAnnotation = annotatedElement.getAnnotation(Lab7.Q2.Version.class);
            System.out.println(versionAnnotation.number());
        }
    }
}
