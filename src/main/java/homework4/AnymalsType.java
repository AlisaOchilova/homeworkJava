package homework4;

public enum AnymalsType {
    CAT("white", 13, "God");
    public static final AnymalsType CAT1 = ("blue", 13, "God");


    public static final AnymalsType DOG = ("white", 13, "God");
    public static final AnymalsType DOG1 = ("blue", 13, "God");

    public String color;
    public int age;
    public String name;


    AnymalsType(String color, int age, String name) {
        this.color = color;
        this.age = age;
        this.name = name;
    }
}
