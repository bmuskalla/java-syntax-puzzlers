package adventurous.java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.function.Function;


@TypeAnnotationsEverywhere.Immutable
public class TypeAnnotationsEverywhere {

    @Target({ElementType.TYPE_USE})
    public @interface Immutable {
    }
    
    public void giveMeMoreTypes() throws @Immutable RuntimeException {
        Object instance = new @Immutable Object();
        System.out.println(instance);

        System.out.println(new Foo());
    }

    static class Foo implements @Immutable Function<Object, Object> {

        @Override
        public Object apply(Object o) {
            return null;
        }
    }
    public static void main(String[] args) {
        new TypeAnnotationsEverywhere().giveMeMoreTypes();
    }
    
}
