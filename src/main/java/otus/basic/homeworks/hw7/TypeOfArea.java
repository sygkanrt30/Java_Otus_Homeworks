package otus.basic.homeworks.hw7;

public enum TypeOfArea {
    FOREST("лес"),
    PLAIN("равнина"),
    SWAMP("болото");

    private final String name;

    TypeOfArea(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
