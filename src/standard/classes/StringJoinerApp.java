package standard.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner SJ = new StringJoiner(
                ", ", "[", "]"
        );

        SJ.add("Komeng");
        SJ.add("Kysa");
        SJ.add("Tri");
        SJ.add("Darma");

        String value = SJ.toString();
        System.out.println(value);


    }
}
