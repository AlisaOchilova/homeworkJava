package homework2;


public enum AnimalType {
    CAT("кошка", "мяукает", "гав"),
    DOG("собака", "гавкает", "мяу");

    private String russianName;
    private String action;

    AnimalType(String russianName, String action, String гав) {
        this.russianName = russianName;
        this.action = action;
    }

    @Override
    public String toString() {
        return russianName;
    }
}


