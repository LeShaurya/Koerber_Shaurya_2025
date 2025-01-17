package Lab7.Q2;

import java.lang.annotation.*;

@Target(value = { ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
    double number();
}