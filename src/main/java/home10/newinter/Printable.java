package home10.newinter;

import home10.inter.Result;

public interface Printable {

    void print();

    default void printInformation(Result result) {
        switch (result) {
            case FAHRENHEIT -> System.out.println("Назван в честь немецкого учёного Габриеля Фаренгейта, предложившего в 1724 году шкалу для измерения температуры.");
            case CELSIUS -> System.out.println("Градус Цельсия назван в честь шведского учёного Андерса Цельсия, предложившего в 1742 году новую шкалу для измерения температуры");
        }

    }

}
