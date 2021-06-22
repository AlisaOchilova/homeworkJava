package homework2;

import java.util.Objects;

public class Animals {
    public int amount;
    private AnimalType animalType;
    public static double usy;
    private String sound;

    public void setAmountmount(final int amount)
    {
        this.amount = amount;
    }
    public void setAnimalType(final AnimalType animalType){

        this.animalType = animalType;
    }

    public void setUsy(final double usy){

        Animals.usy = usy;
    }

    @Override
    public String toString() {

        return "Это животное" + animalType + "умеет" + sound;
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() == o.getClass()) {
            System.out.printf("Зачем сравнивать один и тот же класс?");
            return this == o;
        }
        if (o == null || getClass() != o.getClass()) {
            System.out.printf("Это разные классы");
            return false;
        }
        Animals mammals = (Animals) o;
        return amount == mammals.amount && animalType == mammals.animalType && Objects.equals(sound, mammals.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, animalType, sound);
    }

    public Animals(final AnimalType animalType, final String sound){
        this.animalType = animalType;
        this.sound = sound;
    }

    void makeSound(String sound){
        System.out.println(sound);
    }

    static void move(){
        System.out.println("пошел");
    }
}
