package OOP_java.lab_1;

import OOP_java.lab_1.Violin;

public class lab {
    public static void main(String[] args) {
        Violin violin = new Violin(
            "Скрипка",
            "Stradivari",
            1715,
            4,
            "Сталь",
            false,
            "Пернамбуко",
            59.0,
            false
        );

        violin.printInfo();
        violin.playWithBow();
        violin.tune();
        violin.playWithBow();
        violin.playPizzicato();
        violin.attachShoulderRest();
        violin.replaceStrings("Синтетика");
        violin.playPizzicato();
    }
}
