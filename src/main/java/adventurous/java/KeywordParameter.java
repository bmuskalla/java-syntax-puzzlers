package adventurous.java;

public class KeywordParameter {

    public static void main(String[] args) {
        KeywordParameter someObject = new KeywordParameter();
        someObject.callMe(3);
    }
    public void callMe(@TypeAnnotationsEverywhere.Immutable KeywordParameter this, int foo) {
        // ...
    }
    
    
}
