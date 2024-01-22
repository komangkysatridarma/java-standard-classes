package standard.classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {

        String query = "Komeng Kysa Tri Darma";

        String endcoded =  Base64.getEncoder().encodeToString(query.getBytes());
        System.out.println(endcoded);

        byte[] bytes = Base64.getDecoder().decode(endcoded);
        String result = new String(bytes);

        System.out.println(result);

    }
}
