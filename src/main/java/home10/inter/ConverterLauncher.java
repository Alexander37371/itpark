package home10.inter;

import home10.newinter.Convertable;
import home10.newinter.Printable;

import java.io.IOException;

public class ConverterLauncher {

    public static void main(String[] args) throws IOException {
        Convertable convertable = new TemperatureConverter();
        convertable.convert();
        Printable printable = new TemperatureConverter();
        printable.print();

    }
}
