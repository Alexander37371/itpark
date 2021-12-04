package home10.inter;

import home10.newinter.Printable;

public class EnumRunner {

    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {

            }
        };
        printable.printInformation(Result.FAHRENHEIT);
    }
}
