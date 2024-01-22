package standard.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Komeng");
        stringBuilder.append(" ");
        stringBuilder.append("Kysa");
        stringBuilder.append(" ");
        stringBuilder.append("Tri");
        stringBuilder.append(" ");
        stringBuilder.append("Darma");

        String name = stringBuilder.toString();
        System.out.println(name);




    }

}
