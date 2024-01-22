package standard.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name : ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

        System.out.print("Umur : ");
        int umur = scanner.nextInt();
        System.out.println("Umur mu " + umur);

        System.out.println("Hello " + name + "! Umur anda " + umur);


    }
}
