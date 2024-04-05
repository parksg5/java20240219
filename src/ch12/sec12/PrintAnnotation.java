package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Target({METHOD})
@Retention(RUNTIME)
public @interface PrintAnnotation {
    String value() default "-";

    int number() default 15;
}
