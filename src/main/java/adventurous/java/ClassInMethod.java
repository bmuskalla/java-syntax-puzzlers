package adventurous.java;

public class ClassInMethod {
    
    public void howDeepCanWeGo() {
        class Foo {
            public void hello() {
                class Bar {
                   public void helloFromBar() {
                       // You musn't be afraid to dream a little bigger, darling.
                   } 
                }
                new Bar().helloFromBar();
            }
        }
        final Foo instance = new Foo();
        instance.hello();
    }


    public static void main(String[] args) {
        new ClassInMethod().howDeepCanWeGo();
    }
}
