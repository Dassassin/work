package day22.yesterday10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface MyAnno2 {
    String type = "java";
}
