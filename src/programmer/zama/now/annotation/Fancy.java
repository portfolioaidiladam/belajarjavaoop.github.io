package programmer.zama.now.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// belajar Annotation
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {

    String name();

    String [] tags() default {};
}
