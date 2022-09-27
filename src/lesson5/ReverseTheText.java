package lesson5;

public class ReverseTheText {
    public static String reverseTheText(String text){
        return new StringBuilder(text).reverse().toString();
    }
}
