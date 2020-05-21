package Homework2;

import java.util.Arrays;

public class Dog {

    //variable
    String rasa;

    int varsta;

    String culoare;

    String marime;



    //metode
    public String getInfo() {
        return ("Rasa este: " + rasa + ", cu varsta de  " + varsta + "ani, culoarea " + culoare + " si de talie "
            + marime);
    }

    public void getSleepHours(int numarOre){
        System.out.println("Doarme " + numarOre + " ore");
    }

    public void getMananaca(String tipDeCarne){
        System.out.println("Mananca carne de " + tipDeCarne);
    }

    public static void main(String[] args) {
        Dog maltese = new Dog();
        maltese.rasa = "Bichon";
        maltese.marime = "mica";
        maltese.culoare = "alba";
        maltese.varsta = 2;
        System.out.println(maltese.getInfo());
        maltese.getSleepHours(2);
        maltese.getMananaca("vita");
    }

}
