package homework2;

public class TestMammals {

    public static void main(String[] args) {
        Animals dog = new Dog(AnimalType.DOG, "гав");
        dog.setAnimalType(AnimalType.DOG);
        dog.setAmountmount(1000);
        dog.setUsy(20.0);

        System.out.println("dog.toString: " + dog.toString());


        Animals cat = new Cat(AnimalType.CAT, "мяу");
        cat.amount = 1000;
        cat.usy = 20.0;

        System.out.println("cat.toString: " + cat.toString());

        System.out.println(dog.equals(cat));
        System.out.println(dog.hashCode());


    }
}


