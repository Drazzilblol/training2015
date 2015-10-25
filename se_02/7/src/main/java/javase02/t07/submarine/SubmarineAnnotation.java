package javase02.t07.submarine;

/**
 * Created by Drazz on 23.10.2015.
 */

import java.lang.annotation.*;


@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.SOURCE)
@Documented
public @interface SubmarineAnnotation {
    String name();
}
