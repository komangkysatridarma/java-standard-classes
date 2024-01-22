package standard.classes;

public class StringApp {
    public static void main(String[] args) {

        String name = "Komang Kysa Tri Darma";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Komang"));
        System.out.println(name.endsWith("Darma"));

        String[] names = name.split(" ");
        System.out.println(names);
        for(var value : names){
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(name.charAt(0));



    }
}
