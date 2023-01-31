import java.lang.reflect.Array;

public class Color {


    public static final String ANSI_RESET = "\u001B[0m";
    public static void color_text(String text, Integer usColor){
        String[] colors = new String[]{"\u001B[30m", "\u001B[31m", "\u001B[32m", "\u001B[33m"};
        System.out.println(colors[usColor] + text + ANSI_RESET);
    }

}
