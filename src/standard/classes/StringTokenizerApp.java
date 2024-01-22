package standard.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {

        String value = "Komeng Kysa Tri Darma";

        StringTokenizer ST = new StringTokenizer(value, ",");

        while(ST.hasMoreTokens()){
            String result = ST.nextToken();
            System.out.println(result);
        }

    }
}
