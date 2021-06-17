package homework2;

import homework2.Mammals;

public class TestMammals {

    public static void main(String[] args) {
        Mammals dog = new Mammals();
        dog.vid = "собака";
        dog.kolichestvo = 1000;
        dog.usy = 20.0;

        System.out.println("dog.toString: " + dog.toString());


        Mammals cat = new Mammals();
        cat.vid = "кошка";
        cat.kolichestvo = 1000;
        cat.usy = 20.0;

        System.out.println("cat.toString: " + cat.toString());


    }
}


