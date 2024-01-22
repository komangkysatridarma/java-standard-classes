package standard.classes;

public class NumberApp {
    public static void main(String[] args) {

        Integer intNumber = 10;

        Short shortNumber = intNumber.shortValue();
        Byte byteNumber = intNumber.byteValue();
        Long longNumber = intNumber.longValue();
        Double doubleNumber = intNumber.doubleValue();

        String intString = "1000";

        Integer intNumberr = Integer.valueOf(intString);
        System.out.println(intNumberr);


    }
}
