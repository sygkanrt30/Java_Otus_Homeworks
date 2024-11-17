package otus.basic.homeworks.hw7;

public enum TypeOfTransport {
    CAR("автомобиль"),
    HORSE("лошадь"),
    BICYCLE("велосипед"),
    TERRAIN_VEHICLE("вездеход");

    private final String name;

    TypeOfTransport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
